package com.zy.zymovies.controller;

import javax.servlet.http.HttpSession;

public class BaseController {
    public Integer getUidFromSession(HttpSession session){
        Integer uid=Integer.parseInt(session.getAttribute("uid").toString());
        return uid;
    }
    public String getUsernameFromSession(HttpSession session){
        String username=session.getAttribute("username").toString();
        return username;
    }
}
