package com.zy.zymovies.controller;

import com.alibaba.fastjson.JSONObject;
import com.zy.zymovies.service.exception.*;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class JsonController {
    @ExceptionHandler(Exception.class)
    public @ResponseBody JSONObject handleException(Throwable exception){
        JSONObject jsonObject=new JSONObject();


        if(exception instanceof UserNameOccupiedException){
            jsonObject.put("state",4000);
            jsonObject.put("message","被注册了！");

        }else if(exception instanceof UserNoFound){
            jsonObject.put("state",4000);
            jsonObject.put("message","没找到");
        }else if(exception instanceof PasswordNotRight){
            jsonObject.put("state",4000);
            jsonObject.put("message","密码错了");
        }else if(exception instanceof MovieHasWanted){
            jsonObject.put("state",4000);
            jsonObject.put("message","已经想看了");
        }else if (exception instanceof MovieHasWatched){
            jsonObject.put("state",4000);
            jsonObject.put("message","已经看过了");
        }else if(exception instanceof movieHasCommentedException){
            jsonObject.put("state",4000);
            jsonObject.put("message","已经评价过了！可以删除该评价创建新的评价！");
        }

        return jsonObject;
    }
}
