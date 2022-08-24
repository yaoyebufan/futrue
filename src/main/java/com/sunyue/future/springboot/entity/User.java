package com.sunyue.future.springboot.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author sunyue
 * @version 1.0
 * @class Tuser
 * @description: t_user表的实体类
 * @date 2022/8/24 9:35
 */
@Data
public class User implements Serializable {
    public String id;
    public String name;
    public String password;
}
