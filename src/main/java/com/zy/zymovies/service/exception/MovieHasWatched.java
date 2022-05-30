package com.zy.zymovies.service.exception;

public class MovieHasWatched extends RuntimeException{
    public MovieHasWatched(String message) {
        super(message);
    }
}
