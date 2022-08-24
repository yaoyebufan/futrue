package com.sunyue.future;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sunyue
 * @version 1.0
 * @class FutureApplication
 * @description: 启动类
 * @date 2022/8/24 9:48
 */
@SpringBootApplication
@MapperScan("com.sunyue.future.springboot.dao")
public class FutureApplication {

    public static void main(String[] args) {
        SpringApplication.run(FutureApplication.class, args);
    }

}
