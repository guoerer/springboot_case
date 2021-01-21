package com.atguigu.test;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**测试业务层有没有问题
 * @author lijian
 * @create 2021-01-21 15:53
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void findAll() {
        List<User> users = userService.findAll();
        System.out.println(users);
    }

}
