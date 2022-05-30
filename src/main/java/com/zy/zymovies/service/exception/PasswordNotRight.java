package com.zy.zymovies.service.exception;

public class PasswordNotRight extends RuntimeException{
    public PasswordNotRight(String message) {
        super(message);
    }
}
