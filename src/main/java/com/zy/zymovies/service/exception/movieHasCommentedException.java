package com.zy.zymovies.service.exception;

public class movieHasCommentedException extends RuntimeException{
    public movieHasCommentedException(String message) {
        super(message);
    }
}
