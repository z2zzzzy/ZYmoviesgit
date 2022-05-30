package com.zy.zymovies.mapper;

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
public class TWatchedMapperTest {
    @Autowired
    private TWatchedMapper tWatchedMapper;

    @Test
    public void insertAllTestTest(){
        TWatched tWatched=new TWatched();
        tWatched.setMid(3);
        tWatched.setUid(4);
        tWatched.setDate(new Date(System.currentTimeMillis()));
        tWatched.setMyrate(1);
        Integer rows=tWatchedMapper.addIWatched(tWatched);
        System.out.println(rows);
    }

    @Test
    public void selectByMidAndUidTest(){
        Integer mid=1;
        Integer uid=4;
        TWatched tWatched=tWatchedMapper.selectByMidAndUid(mid,uid);
        System.out.println(tWatched);
    }

    @Test
    public void deleteByMidAndUidTest(){
        Integer mid=4;
        Integer uid=4;
        Integer rows=tWatchedMapper.deleteByMidAndUid(mid,uid);
        System.out.println(rows);
    }

    @Test
    public void searchAllByUidTest(){
        Integer uid=4;
        List<TWatched> list=tWatchedMapper.searchAllByUid(uid);
        for (TWatched item:list){
            System.out.println(item);
        }
    }
}
