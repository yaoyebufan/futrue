package com.sunyue.future;

import com.sunyue.future.springboot.dao.UserDao;
import com.sunyue.future.springboot.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author sunyue
 * @class FutureApplicationTests
 * @description: 测试类
 * @date 2022/8/24 9:50
 */
@SpringBootTest
class FutureApplicationTests {
    @Autowired(required = false)
    private UserDao userDao;

    /**
     * @author sunyue
     * @param: null
     * @return: null
     * @description: 数据库测试连接
     * @date: 2022/8/24 10:57
     */
    @Test
    void JDBCTest() {
        //查询一条数据
        List<User> users = userDao.selectAll();
        for (User user : users) {
            System.out.println(user.getName());
        }
        User user = new User();
        user.setName("s1un");
        user.setPassword("2123456");
        user.setId("1");
        //插入一条数据
        userDao.insert(user);
        //更新一条数据
        userDao.update(user);
        //删除一条数据
        userDao.delete(user);
    }

}
