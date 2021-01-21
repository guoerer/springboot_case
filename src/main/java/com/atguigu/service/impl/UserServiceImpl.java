package com.atguigu.service.impl;

import com.atguigu.dao.UserMapper;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Override
    //事务只读属性，传播途径：支持传播
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public List<User> findAll() {
        return userMapper.selectAll();
    }
}
