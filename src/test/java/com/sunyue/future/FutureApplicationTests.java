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

    @Test
    void contextLoads() {
        List<User> users = userDao.selectAll();
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

}
