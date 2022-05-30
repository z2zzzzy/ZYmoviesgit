package com.zy.zymovies.service.impl;

import com.zy.zymovies.entity.Movie;
import com.zy.zymovies.mapper.MovieMapper;
import com.zy.zymovies.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements IMovieService {

    @Autowired
    private MovieMapper movieMapper;

    @Override
    public Movie getMovieByMid(Integer mid) {
        Movie movie=movieMapper.getMovieByMid(mid);
        return movie;
    }

    @Override
    public List<Movie> getAllMovie() {
        List<Movie> list=movieMapper.getAllMovie();
        return list;
    }
}
