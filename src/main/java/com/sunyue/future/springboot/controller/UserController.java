package com.sunyue.future.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author sunyue
 * @class UserController
 * @description: 用户控制层
 * @date 2022/8/24 10:16
 */
@Controller
public class UserController {
    /**
     * @class UserController
     * @description: 主页跳转
     * @author sunyue
     * @date 2022/8/24 10:47

     */
    @RequestMapping(path = {"", "index"}, method = RequestMethod.GET)
    private String index() {
        return "index";
    }
}
