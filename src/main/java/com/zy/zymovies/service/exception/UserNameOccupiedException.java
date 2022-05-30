package com.zy.zymovies.service.exception;

public class UserNameOccupiedException extends RuntimeException{
    public UserNameOccupiedException(String message) {
        super(message);
    }
}
