package com.zy.zymovies.service;

import com.zy.zymovies.entity.TComment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
/*表示启动这个单元测试类（单元测试类时不能够运行的）,需要传递一个参数，必须是SpringRunner的实例类型*/
@RunWith(SpringRunner.class)
public class TCommentServiceTest {
    @Autowired
    private TCommentService tCommentService;

    @Test
    public void addMyCommentTest(){
        TComment tComment=new TComment();
        tComment.setUid(4);
        tComment.setMid(4);
        tComment.setContent("!!!");
        try{
            tCommentService.addMyComment(tComment);
        }catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void searchAllTest(){
        List<TComment> list=tCommentService.searchAll();
        for (TComment item:list){
            System.out.println(item);
        }

    }

    @Test
    public void deleteMyCommentTest(){
        Integer rows=tCommentService.deleteMyComment(1,4);
        System.out.println(rows);
    }
}
