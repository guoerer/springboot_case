package com.atguigu.service.impl;

import com.atguigu.dao.UserMapper;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lijian
 * @create 2021-01-21 15:49
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RedisTemplate redisTemplate;//redis 缓存的实现。redis模板
    @Override
    //事务只读属性，传播途径：支持传播
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public List<User> findAll() {
        //从缓存中查询数据  规定存储用户信息使用string类型进行存储, 存储的key就是userList
        List<User> userList = (List<User>) redisTemplate.boundValueOps("userList").get();
        if (userList==null) {
            //第一次从数据库中查询用户数据。并向redis缓存中添加数据
            userList = userMapper.selectAll();
            redisTemplate.boundValueOps("userList").set(userList);
            System.out.println("从数据库中查询");
        }else{
            System.out.println("从缓存中查询数据");
        }
        return userList;
    }
}
