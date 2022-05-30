package com.zy.zymovies.mapper;


import com.zy.zymovies.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@SpringBootTest
/*表示启动这个单元测试类（单元测试类时不能够运行的）,需要传递一个参数，必须是SpringRunner的实例类型*/
@RunWith(SpringRunner.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;



    @Test
    public void registerTest(){
        User user=new User();
        user.setUsername("zhangyi");
        user.setPassword("123456");
        Integer rows=userMapper.register(user);
        System.out.println(rows);
    }

    @Test
    public void changePasswordTest(){
        String username="bob";
        String newPassword="3333333";
        Integer rows=userMapper.changePassword(username,newPassword);
        System.out.println(rows);
    }

    @Test
    public void changeInfoTest(){
        String username="bob";
        String phone="17863528372";
        String email="178672@qq.com";
        Integer gender=2;
        Integer rows=userMapper.changeInfo(username,phone,email,gender);
        System.out.println(rows);
    }

    @Test
    public void selectUsernameByUidTest(){
        Integer uid=4;
        User user=userMapper.selectUsernameByUid(uid);
        System.out.println(user.getUsername());
    }


}