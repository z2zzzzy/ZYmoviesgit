package com.zy.zymovies.mapper;

import com.zy.zymovies.entity.TComment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.util.List;

@SpringBootTest
/*表示启动这个单元测试类（单元测试类时不能够运行的）,需要传递一个参数，必须是SpringRunner的实例类型*/
@RunWith(SpringRunner.class)
public class TCommentMapperTest {
    @Autowired
    private TCommentMapper tCommentMapper;

    @Test
    public void addAllTest(){
        TComment tComment=new TComment();
        tComment.setUid(4);
        tComment.setMid(4);
        tComment.setDate(new Date(System.currentTimeMillis()));
        tComment.setContent("这部电影很好看!");
        Integer rows=tCommentMapper.insertAll(tComment);
        System.out.println(rows);

    }

    @Test
    public void doesCommentedTest(){
        Integer uid=4;
        Integer mid=4;
        TComment tComment=tCommentMapper.doesCommented(mid,uid);
        System.out.println(tComment);
    }

    @Test
    public void searchAllTest(){
        List<TComment> list=tCommentMapper.searchAll();
        for (TComment item:list){
            System.out.println(item);
        }
    }

    @Test
    public void deleteByMidAndUid(){
        Integer rows=tCommentMapper.deleteByMidAndUid(4,4);
        System.out.println(rows);
    }
}
