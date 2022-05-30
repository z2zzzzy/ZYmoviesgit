package com.zy.zymovies.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.zy.zymovies.entity.TWatched;



/**
* @author zy
* @description 针对表【t_watched】的数据库操作Mapper
* @createDate 2022-05-12 15:20:47
* @Entity generator.domain.TWatched
*/
public interface TWatchedMapper{

    /*在t_watched表中添加用户“已看”条目*/
    int addIWatched(TWatched tWatched);

    /*查询用户是否已经“已看”这个电影*/
    TWatched selectByMidAndUid(@Param("mid") Integer mid, @Param("uid") Integer uid);

    /*删除用户"已看"信息*/
    int deleteByMidAndUid(@Param("mid") Integer mid, @Param("uid") Integer uid);

    /*查询用户所有“已看”电影*/
    List<TWatched> searchAllByUid(@Param("uid") Integer uid);
}
