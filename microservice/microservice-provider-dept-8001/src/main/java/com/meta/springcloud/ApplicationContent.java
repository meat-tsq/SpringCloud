package com.meta.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Tang poetry all
 * @Date 2022/6/6 9:24
 */
@SpringBootApplication
@MapperScan(value = {"com.meta.springcloud.dao"})
public class ApplicationContent {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationContent.class,args);
    }
}
