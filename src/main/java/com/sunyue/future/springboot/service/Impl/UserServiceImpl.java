package com.sunyue.future.springboot.service.Impl;

import com.sunyue.future.springboot.dao.UserDao;
import com.sunyue.future.springboot.entity.User;
import com.sunyue.future.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author sunyue
 * @class UserServiceImpl
 * @description: 用户业务实现
 * @date 2022/8/24 13:52
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    public UserDao userDao;

    @Override
    public List<User> findAllUsers() {
        List<User> userList = userDao.selectAll();
        if (userList.size() == 0) {
            return null;
        }
        return userList;
    }

    @Override
    public void insertUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public Integer count() {
        return userDao.count();
    }

    @Override
    public List<User> pageUserList(Map<String, Integer> map) {
        return userDao.pageList(map);
    }
}
