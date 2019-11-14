package com.qf.jianshu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qf.jianshu.mapper")
public class JianshuApplication {

    public static void main(String[] args) {
        SpringApplication.run(JianshuApplication.class, args);
    }

}
