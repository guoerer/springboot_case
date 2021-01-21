package com.atguigu.service;

import com.atguigu.pojo.User;

import java.util.List;

/**
 * @author lijian
 * @create 2021-01-21 15:47
 */
public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll();

}
