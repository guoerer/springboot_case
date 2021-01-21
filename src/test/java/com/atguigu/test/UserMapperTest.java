package com.atguigu.test;

import com.atguigu.dao.UserMapper;
import com.atguigu.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

/**
 * @author lijian
 * @create 2021-01-21 15:22
 */
@RunWith(SpringRunner.class) //spring 方式启动
@SpringBootTest //boot Test 测试注解
public class UserMapperTest {
    @Autowired
    UserMapper userMapper;
    @Test
    public void findAll(){
        List<User> users = userMapper.selectAll();
        System.out.println("users = " + users);

    }
}
