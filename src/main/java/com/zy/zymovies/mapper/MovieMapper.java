package com.zy.zymovies.mapper;

import com.zy.zymovies.entity.Movie;

import java.util.List;

public interface MovieMapper {
    /*通过mid获取到电影信息*/
    Movie getMovieByMid(Integer mid);

    /*获得所有电影信息*/
    List<Movie> getAllMovie();
}
