package com.sunyue.future.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author sunyue
 * @version 1.0
 * @class UserController
 * @description: 用户控制层
 * @date 2022/8/24 10:16
 */
@Controller
public class UserController {
    @RequestMapping(path = {"", "index"}, method = RequestMethod.GET)
    private String index() {
        return "index";
    }
}
