package com.zy.zymovies.service;


import com.zy.zymovies.entity.TWant;
import com.zy.zymovies.entity.TWatched;

import java.util.List;

/**
* @author zy
* @description 针对表【t_watched】的数据库操作Service
* @createDate 2022-05-12 15:20:47
*/
public interface TWatchedService{
    /*用户添加“已看”电影信息*/
    void addIWatched(TWatched tWatched);

    /*删除用户已看信息*/
    Integer deleteByMidAndUid(Integer mid,Integer uid);

    /*根据用户id查询用户所有已看电影*/
    List<TWatched> searchAllByUid(Integer uid);
}
