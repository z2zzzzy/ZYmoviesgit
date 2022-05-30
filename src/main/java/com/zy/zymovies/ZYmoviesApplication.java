package com.zy.zymovies;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zy.zymovies.mapper")
public class ZYmoviesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZYmoviesApplication.class, args);
    }

}
