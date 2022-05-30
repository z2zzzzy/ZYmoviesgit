package com.zy.zymovies.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.zy.zymovies.entity.User;
import com.zy.zymovies.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("/register")
    public @ResponseBody
    JSONObject register(User user){
        JSONObject jsonObject=new JSONObject();
        iUserService.Register(user);
        jsonObject.put("state",200);
        return jsonObject;

    }

    @RequestMapping("/login")
    public @ResponseBody
    JSONObject login(String username, String password,HttpSession session){
        JSONObject jsonObject=new JSONObject();
        User user= iUserService.login(username,password);
        session.setAttribute("uid",user.getUid());
        session.setAttribute("username",user.getUsername());
        jsonObject.put("state",200);
        return jsonObject;
    }

    @RequestMapping("/changePassword")
    public @ResponseBody
    JSONObject changePassword(String password,String newPassword,HttpSession session){
        JSONObject jsonObject=new JSONObject();
        String username=getUsernameFromSession(session);
        iUserService.changePassword(username,password,newPassword);
        jsonObject.put("state",200);
        return jsonObject;
    }

    @RequestMapping("/changeInfo")
    public @ResponseBody
    JSONObject changeInfo(String phone,String email,String gender,HttpSession session){
        JSONObject jsonObject=new JSONObject();
        String username=getUsernameFromSession(session);
        iUserService.changeInfo(username,phone,email,Integer.parseInt(gender.toString()));
        jsonObject.put("state",200);
        return jsonObject;
    }



}
