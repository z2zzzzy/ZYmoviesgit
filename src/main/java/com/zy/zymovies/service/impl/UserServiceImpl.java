package com.zy.zymovies.service.impl;

import com.zy.zymovies.entity.User;
import com.zy.zymovies.mapper.UserMapper;
import com.zy.zymovies.service.IUserService;
import com.zy.zymovies.service.exception.PasswordNotRight;
import com.zy.zymovies.service.exception.UserNameOccupiedException;
import com.zy.zymovies.service.exception.UserNoFound;
import com.zy.zymovies.service.exception.UserRegisterException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.text.ParseException;
import java.util.UUID;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void Register(User user){
        String username=user.getUsername();
        User exist=userMapper.nameDoesExist(username);


        if(exist!=null){
            throw new UserNameOccupiedException("此用户名已被注册");
        }


        String beforeMD5=user.getPassword();
        String salt= UUID.randomUUID().toString();
        user.setSalt(salt);
        String afterMD5=encodeToMD5(beforeMD5,salt);
        user.setPassword(afterMD5);

        Integer rows=userMapper.register(user);
        if(rows!=1){
            throw new UserRegisterException("注册用户时出错");
        }

    }

    @Override
    public User login(String username, String password) {
        User exist=userMapper.nameDoesExist(username);
        if(exist==null){
            throw new UserNoFound("未找到用户");
        }
        if(!verifyPassword(password,exist.getSalt(),exist.getPassword())){
            throw new PasswordNotRight("密码错误");
        }

        User user=new User();
        user.setUid(exist.getUid());
        user.setUsername(exist.getUsername());
        return user;
    }

    @Override
    public void changePassword(String username, String Password,String newPassword) {
        User exist=userMapper.nameDoesExist(username);
        if(!verifyPassword(Password,exist.getSalt(),exist.getPassword())){
            throw new PasswordNotRight("密码错误");
        }
        userMapper.changePassword(username,encodeToMD5(newPassword,exist.getSalt()));
    }

    @Override
    public void changeInfo(String username, String phone, String email, Integer gender) {
        userMapper.changeInfo(username,phone,email,gender);
    }

    @Override
    public String selectUsernameByUid(Integer uid) {
        User user=userMapper.selectUsernameByUid(uid);
        return user.getUsername();
    }

    //    后期改为shiro
    private String encodeToMD5(String beforeMD5,String salt){
        beforeMD5= DigestUtils.md5DigestAsHex((salt+beforeMD5).getBytes());
        return beforeMD5;
    }
    private boolean verifyPassword(String passwordToVerify,String salt,String rightPassword){
        passwordToVerify=encodeToMD5(passwordToVerify,salt);
        if(passwordToVerify.equals(rightPassword))
            return true;
        return false;
    }
}
