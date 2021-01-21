package com.atguigu.dao;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author lijian
 * @create 2021-01-21 15:20
 */
@Component
public interface UserMapper extends Mapper<User> {

}
