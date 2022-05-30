package com.zy.zymovies.service;

import com.zy.zymovies.entity.Movie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
/*表示启动这个单元测试类（单元测试类时不能够运行的）,需要传递一个参数，必须是SpringRunner的实例类型*/
@RunWith(SpringRunner.class)
public class MovieServiceTest {
    @Autowired
    private IMovieService iMovieService;

    @Test
    public void getMovieByMidTest(){
        Integer mid=4;
        Movie movie=iMovieService.getMovieByMid(mid);
        System.out.println(movie);
    }

    @Test
    public void getAllMovieTest(){
        List<Movie> list=iMovieService.getAllMovie();
        for (Movie item:list){
            System.out.println(item);
        }

    }

}
