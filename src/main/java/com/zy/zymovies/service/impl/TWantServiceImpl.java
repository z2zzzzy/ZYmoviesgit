package com.zy.zymovies.service.impl;


import com.zy.zymovies.entity.TWant;
import com.zy.zymovies.mapper.TWantMapper;
import com.zy.zymovies.service.TWantService;
import com.zy.zymovies.service.exception.MovieHasWanted;
import com.zy.zymovies.service.exception.UnKnownException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author zy
* @description 针对表【t_want】的数据库操作Service实现
* @createDate 2022-05-11 11:22:28
*/
@Service
public class TWantServiceImpl implements TWantService {
    @Autowired
    private TWantMapper tWantMapper;

    @Override
    public void AddIWantWatch(TWant tWant) {
        Integer uid=tWant.getUid();
        Integer mid=tWant.getMid();
        TWant exist=tWantMapper.doesWanted(uid,mid);
        if(exist!=null){
            throw new MovieHasWanted("已经想看了！");
        }

        Integer rows=tWantMapper.AddIWantWatch(tWant);
        System.out.println(rows);
        if(rows!=1){
            throw new UnKnownException("未知错误！");
        }
    }

    @Override
    public List<TWant> searchAllByUid(Integer uid) {
        List<TWant> list=tWantMapper.searchAllByUid(uid);
        return list;
    }

    @Override
    public Integer deleteByMidAndUid(Integer mid, Integer uid) {
        Integer rows=tWantMapper.deleteByMidAndUid(mid,uid);
        return rows;
    }
}
