package com.zy.zymovies.mapper;
import java.util.List;

import com.zy.zymovies.entity.TWant;
import org.apache.ibatis.annotations.Param;

public interface TWantMapper {
    /*在t_want表中插入用户“想看”电影条目*/
    Integer AddIWantWatch(TWant tWant);

     /*查询用户是否已经“想看”这个电影*/
    TWant doesWanted(@Param("uid")Integer uid, @Param("mid")Integer mid);

    /*删除用户"想看"信息*/
    Integer deleteByMidAndUid(@Param("mid") Integer mid, @Param("uid") Integer uid);

    /*查询用户所有“想看”电影*/
    List<TWant> searchAllByUid(@Param("uid") Integer uid);
}
