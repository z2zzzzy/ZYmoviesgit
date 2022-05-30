package com.zy.zymovies.service;

import com.zy.zymovies.entity.User;

public interface IUserService {
    /*用户注册*/
    void Register(User user);

    /*用户登陆服务*/
    User login(String username,String password);

    /*用户更改密码服务*/
    void changePassword(String username,String Password,String newPassword);

    /*用户更改个人信息服务*/
    void changeInfo(String username,String phone,String email,Integer gender);

    /*根据id查询用户名称*/
    String selectUsernameByUid(Integer uid);
}
