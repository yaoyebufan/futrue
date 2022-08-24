package com.sunyue.future.springboot.service;

import com.sunyue.future.springboot.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author sunyue
 * @class UserService
 * @description: 用户业务接口
 * @date 2022/8/24 13:52
 */
@Service
public interface UserService {
    /**
     * 返回所有用户表中的数据
     *
     * @param: null
     * @return: List<User>
     * @author sunyue
     * @date: 2022/8/24 13:56
     */
    List<User> findAllUsers();

    /**
     * 插入一条数据
     *
     * @param: User
     * @return: null
     * @author sunyue
     * @date 2022/8/24 13:57
     */
    void insertUser(User user);

    /**
     * 删除一条数据
     *
     * @param: User
     * @return: null
     * @author sunyue
     * @date: 2022/8/24 13:57
     */
    void deleteUser(User user);

    /**
     * 更新一条数据
     *
     * @param: User
     * @return: null
     * @author sunyue
     * @date 2022/8/24 13:58
     */
    void updateUser(User user);

    /**
     * 查询总条数
     *
     * @param: null
     * @return: Integer
     * @author sunyue
     * @date: 2022/8/24 13:58
     */
    Integer count();

    /**
     * 分页数据
     *
     * @param: List<User>
     * @return: Map<String, Integer>
     * @author sunyue
     * @date: 2022/8/24 13:59
     */
    List<User> pageUserList(Map<String, Integer> map);
}
