package com.sunyue.future.springboot.controller;

import com.sunyue.future.springboot.entity.User;
import com.sunyue.future.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sunyue
 * @class UserController
 * @description: 用户控制层
 * @date 2022/8/24 10:16
 */
@Controller
public class UserController {
    @Autowired
    public UserService userService;

    /**
     * @param model
     * @return String
     * @author sunyue
     * @description 主页跳转
     * @date 2022/8/24 11:03
     */
    @RequestMapping(path = {"", "index"}, method = RequestMethod.GET)
    public String index(Model model) {
        Map<String, Integer> params = new HashMap<>(16);
        params.put("pageNumber", 0);
        params.put("pageSize", 10);
        model.addAttribute("userList", userService.pageUserList(params));
        Integer[] integers = new Integer[userService.count()];
        for (int i = 0; i < userService.count(); i++) {
            integers[i] = i + 1;
        }
        model.addAttribute("count", integers);
        return "index";
    }

    /**
     * @param pageNumber pageSize
     * @return String
     * @author sunyue
     * @description 分页跳转
     * @date 2022/8/24 11:03
     */
    @ResponseBody
    @RequestMapping(path = "page/{pageNumber}/{pageSize}", method = RequestMethod.GET)
    public List<User> page(@PathVariable("pageNumber") Integer pageNumber, @PathVariable("pageSize") Integer pageSize) {
        Map<String, Integer> params = new HashMap<>(16);
        params.put("pageNumber", pageNumber);
        params.put("pageSize", pageSize);
        return userService.pageUserList(params);
    }
}
