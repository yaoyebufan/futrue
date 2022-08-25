package com.sunyue.future.springboot.dao;

import com.sunyue.future.springboot.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author sunyue
 * @class UserDao
 * @description 用户表访问接口
 * @date 2022/8/23 1605
 */
public interface UserDao {
    /**
     * 返回所有用户表中的数据
     *
     * @param
     * @return List<User>
     * @author sunyue
     * @date 2022/8/24 919
     */
    List<User> selectAll();

    /**
     * 插入一条数据
     *
     * @param user
     * @return null
     * @author sunyue
     * @date 2022/8/24 1125
     */
    void insert(User user);

    /**
     * 更新一条数据
     *
     * @param user
     * @return null
     * @author sunyue
     * @date 2022/8/24 1200
     */
    void update(User user);

    /**
     * 删除一条数据
     *
     * @param user
     * @return null
     * @author sunyue
     * @date 2022/8/24 1310
     */
    void delete(User user);

    /**
     * 分页数据
     *
     * @param map
     * @return Map<String, Integer>
     * @author sunyue
     * @date 2022/8/24 1324
     */
    List<User> pageList(Map<String, Integer> map);

    /**
     * 查询总条数
     *
     * @param
     * @return Integer
     * @author sunyue
     * @date 2022/8/24 1341
     */
    Integer count();
}
