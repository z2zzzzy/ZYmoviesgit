package com.zy.zymovies.service;


import com.zy.zymovies.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
/*表示启动这个单元测试类（单元测试类时不能够运行的）,需要传递一个参数，必须是SpringRunner的实例类型*/
@RunWith(SpringRunner.class)
public class UserServiceTest {
    @Autowired
    private IUserService iUserService;
    @Test
    public void registerTest(){
        try {
            User user = new User();
            user.setUsername("bob");
            user.setPassword("123456");
            user.setPhone("11111111");
            iUserService.Register(user);

        }catch (RuntimeException exception){
//            System.out.println(exception.getClass().getSimpleName());
            System.out.println(exception.getMessage());
        }


    }

    @Test
    public void loginTest(){
        try {
            String username="bob";
            String password="123456";
            User user=iUserService.login(username,password);
            System.out.println(user);
        }catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }


    }

    @Test
    public void changePasswordTest(){
        try{
            String username="cici";
            String password="123456";
            String newPassword="111111";
            iUserService.changePassword(username,password,newPassword);

        }catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void changeInfoTest(){
        String username="cici";
        String phone="17863528372";
        String email="178672@qq.com";
        Integer gender=5;
        iUserService.changeInfo(username,phone,email,gender);
    }

    @Test
    public void selectUsernameByUidTest(){
        Integer uid=1;
        String username=iUserService.selectUsernameByUid(uid);
        System.out.println(username);
    }
}
