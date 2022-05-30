package com.zy.zymovies.service;

import com.zy.zymovies.entity.Movie;

import java.util.List;

public interface IMovieService {
    /*根据电影id获得电影信息服务*/
    Movie getMovieByMid(Integer mid);

    /*获取所有电影信息*/
    List<Movie> getAllMovie();
}
