package com.zy.zymovies.service;

import com.zy.zymovies.entity.TWant;
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
public class TWantServiceTest {
    @Autowired
    private TWantService tWantService;

    @Test
    public void IWantWatchTest(){
        try {
            TWant tWant = new TWant();
            tWant.setUid(3);
            tWant.setMid(1);
            tWant.setDate(new Date(System.currentTimeMillis()));
            tWantService.AddIWantWatch(tWant);
        }catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void deleteByMidAndUid(){
        Integer mid=5;
        Integer uid=4;
        Integer rows=tWantService.deleteByMidAndUid(mid,uid);
        System.out.println(rows);
    }

    @Test
    public void searchAllByUidTest(){
        Integer uid=4;
        List<TWant> list= tWantService.searchAllByUid(uid);
        for (TWant item:list){
            System.out.println(item);
        }
    }
}
