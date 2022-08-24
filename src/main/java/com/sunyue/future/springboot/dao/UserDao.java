package com.sunyue.future.springboot.dao;

import com.sunyue.future.springboot.entity.User;

import java.util.List;

/**
 * @author sunyue
 * @class UserDao
 * @description: 用户表访问接口
 * @date 2022/8/23 16:05
 */
public interface UserDao {
    /**
     * 返回所有Tuser表中的数据
     *
     * @param: null
     * @return: List<User>
     * @author sunyue
     * @date: 2022/8/24 9:19
     */
    List<User> selectAll();
}
