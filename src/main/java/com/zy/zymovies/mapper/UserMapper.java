package com.zy.zymovies.mapper;
import java.util.List;

import com.zy.zymovies.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /*注册用户信息*/
    Integer register(User user);

    /*根据用户名判断用户是否存在*/
    User nameDoesExist(String username);

    /*更改用户密码*/
    Integer changePassword(@Param("username")String username, @Param("newPassword")String newPassword);

    /*更改用户信息*/
    Integer changeInfo(@Param("username")String username,@Param("phone")String phone,@Param("email")String email,@Param("gender")Integer gender);

    User selectUsernameByUid(@Param("uid") Integer uid);

}
