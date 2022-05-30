package com.zy.zymovies.service.impl;
import com.zy.zymovies.mapper.TCommentMapper;
import com.zy.zymovies.service.TCommentService;
import com.zy.zymovies.service.exception.UnKnownException;
import com.zy.zymovies.service.exception.movieHasCommentedException;
import com.zy.zymovies.entity.TComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author zy
* @description 针对表【t_comment】的数据库操作Service实现
* @createDate 2022-05-16 09:50:23
*/
@Service
public class TCommentServiceImpl implements TCommentService {
    @Autowired
    private TCommentMapper tCommentMapper;
    @Override
    public void addMyComment(TComment tComment) {
        Integer uid=tComment.getUid();
        Integer mid=tComment.getMid();
        TComment exist=tCommentMapper.doesCommented(mid,uid);
        if(exist!=null){
            throw new movieHasCommentedException("已经评价过了！可以删除该评价创建新的评价！");
        }

        Integer rows=tCommentMapper.insertAll(tComment);
        if(rows!=1){
            throw new UnKnownException("未知错误!");
        }
    }

    @Override
    public List<TComment> searchAll() {
        List<TComment> list=tCommentMapper.searchAll();
        return list;
    }

    @Override
    public Integer deleteMyComment(Integer mid, Integer uid) {
        Integer rows=tCommentMapper.deleteByMidAndUid(mid,uid);
        return rows;
    }
}
