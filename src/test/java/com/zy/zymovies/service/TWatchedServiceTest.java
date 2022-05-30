package com.zy.zymovies.service;

import com.zy.zymovies.entity.TWatched;
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
public class TWatchedServiceTest {
    @Autowired
    private TWatchedService tWatchedService;

    @Test
    public void addIWatchedTest(){
        TWatched tWatched=new TWatched();
        tWatched.setUid(4);
        tWatched.setMid(4);
        tWatched.setMyrate(0);
        tWatched.setDate(new Date(System.currentTimeMillis()));
        try {
            tWatchedService.addIWatched(tWatched);
        }catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void deleteByMidAndUid(){
        Integer mid=5;
        Integer uid=4;
        Integer rows= tWatchedService.deleteByMidAndUid(mid,uid);
        System.out.println(rows);
    }

    @Test
    public void searchAllByUid(){
        Integer uid=4;
        List<TWatched> list=tWatchedService.searchAllByUid(uid);
        for (TWatched item:list){
            System.out.println(item);
        }
    }
}
