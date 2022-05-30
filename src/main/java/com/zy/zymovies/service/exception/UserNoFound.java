package com.zy.zymovies.service.exception;

public class UserNoFound extends RuntimeException{
    public UserNoFound(String message) {
        super(message);
    }
}
