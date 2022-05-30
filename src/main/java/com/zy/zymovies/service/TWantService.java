package com.zy.zymovies.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zy.zymovies.entity.TWant;

import java.util.List;

/**
* @author zy
* @description 针对表【t_want】的数据库操作Service
* @createDate 2022-05-11 11:22:28
*/
public interface TWantService {
    /*用户添加“想看”电影信息*/
    void AddIWantWatch(TWant tWant);

    /*根据用户id查询用户所有想看电影*/
    List<TWant> searchAllByUid(Integer uid);

    /*删除用户想看信息*/
    Integer deleteByMidAndUid(Integer mid,Integer uid);
}
