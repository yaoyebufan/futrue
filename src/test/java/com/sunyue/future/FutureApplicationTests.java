package com.sunyue.future;

import com.sunyue.future.springboot.dao.UserDao;
import com.sunyue.future.springboot.entity.User;
import com.sunyue.future.springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Autowired(required = false)
    private UserService userService;

    /**
     * @author sunyue
     * @param: null
     * @return: null
     * @description: 数据库测试连接
     * @date: 2022/8/24 10:57
     */
    @Test
    void JDBCTest() {
//        //查询一条数据
//        List<User> users = userDao.selectAll();
//        for (User user : users) {
//            System.out.println(user.getName());
//        }
//        User user = new User();
//        user.setName("s1un");
//        user.setPassword("2123456");
//        user.setId("1");
//        //插入一条数据
//        userDao.insert(user);
//        //更新一条数据
//        userDao.update(user);
//        //删除一条数据
//        userDao.delete(user);
//        //批量插入100条数据
//        User user = new User();
//        for (int i = 0; i < 100; i++) {
//            user.setName("user"+i);
//            user.setPassword("password"+i);
//            userDao.insert(user);
//        }

        //分页数据
        Map<String, Integer> map = new HashMap<>();
        map.put("pageNumber", 0);
        map.put("pageSize", 10);
        List<User> pageList = userService.pageUserList(map);
        for (User user1 : pageList) {
            System.out.println(user1.toString());

        }
        //查询总条数
        System.out.println(userService.count());

    }

    @Test
    public void array() {
        Integer[] integers = new Integer[100];
        for (int i = 0; i < 100; i++) {
            integers[i] = i + 1;
        }
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

}
