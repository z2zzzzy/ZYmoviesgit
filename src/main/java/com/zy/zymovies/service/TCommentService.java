package com.zy.zymovies.service;


import com.zy.zymovies.entity.TComment;

import java.util.List;

/**
* @author zy
* @description 针对表【t_comment】的数据库操作Service
* @createDate 2022-05-16 09:50:23
*/
public interface TCommentService{
    void addMyComment(TComment tComment);

    List<TComment> searchAll();

    Integer deleteMyComment(Integer mid,Integer uid);
}
