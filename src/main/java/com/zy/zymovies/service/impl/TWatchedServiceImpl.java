package com.zy.zymovies.service.impl;


import com.zy.zymovies.entity.TWatched;
import com.zy.zymovies.mapper.TWatchedMapper;
import com.zy.zymovies.service.TWatchedService;
import com.zy.zymovies.service.exception.MovieHasWanted;
import com.zy.zymovies.service.exception.MovieHasWatched;
import com.zy.zymovies.service.exception.UnKnownException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author zy
* @description 针对表【t_watched】的数据库操作Service实现
* @createDate 2022-05-12 15:20:47
*/
@Service
public class TWatchedServiceImpl implements TWatchedService {
    @Autowired
    private TWatchedMapper tWatchedMapper;
    @Override
    public void addIWatched(TWatched tWatched) {
        Integer uid=tWatched.getUid();
        Integer mid=tWatched.getMid();
        TWatched exist=tWatchedMapper.selectByMidAndUid(mid,uid);
        if(exist!=null){
            throw new MovieHasWatched("已经看过了！");
        }

        Integer rows= tWatchedMapper.addIWatched(tWatched);
        if(rows!=1){
            throw new UnKnownException("未知错误！");
        }
    }

    @Override
    public Integer deleteByMidAndUid(Integer mid, Integer uid) {
        Integer rows= tWatchedMapper.deleteByMidAndUid(mid,uid);
        return rows;
    }

    @Override
    public List<TWatched> searchAllByUid(Integer uid) {
        List<TWatched> list=tWatchedMapper.searchAllByUid(uid);
        return list;
    }
}
