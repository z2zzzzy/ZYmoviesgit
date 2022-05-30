package com.zy.zymovies.mapper;

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
public class TWantMapperTest {
    @Autowired
    private TWantMapper tWantMapper;

    @Test
    public void AddiWantWatchTest(){
        TWant tWant=new TWant();
        tWant.setDate(new Date(System.currentTimeMillis()));
        tWant.setMid(1);
        tWant.setUid(1);
        Integer rows=tWantMapper.AddIWantWatch(tWant);
        System.out.println(rows);
    }

    /*@Test
    public void doesWantedTest(){
        Integer uid=1;
        Integer mid=1;
        TWant tWant=tWantMapper.doesWanted(uid,mid);
        System.out.println(tWant);
    }*/

    @Test
    public void deleteByMidAndUidTest(){
        Integer uid=2;
        Integer mid=1;
        Integer rows=tWantMapper.deleteByMidAndUid(mid,uid);
        System.out.println(rows);
    }

    @Test
    public void searchAllByUidTest(){
        Integer uid=4;
        List<TWant> list=tWantMapper.searchAllByUid(uid);
        for (TWant item:list){
            System.out.println(item);
        }
    }
}
