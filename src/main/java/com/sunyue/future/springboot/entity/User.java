package com.sunyue.future.springboot.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author sunyue
 * @class User
 * @description 用户表的实体类
 * @date 2022/8/24 9:35
 */
@Data
public class User implements Serializable {
    public String id;
    public String name;
    public String password;
}
