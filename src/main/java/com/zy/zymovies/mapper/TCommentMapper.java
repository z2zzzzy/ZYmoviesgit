package com.zy.zymovies.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.zy.zymovies.entity.TComment;



/**
* @author zy
* @description 针对表【t_comment】的数据库操作Mapper
* @createDate 2022-05-16 09:50:23
* @Entity generator.domain.TComment
*/
public interface TCommentMapper{
    /*为用户添加影评*/
    int insertAll(TComment tComment);

    TComment doesCommented(@Param("mid") Integer mid, @Param("uid") Integer uid);
    /*查询所有影评*/
    List<TComment> searchAll();

    Integer deleteByMidAndUid(@Param("mid") Integer mid, @Param("uid") Integer uid);
}
