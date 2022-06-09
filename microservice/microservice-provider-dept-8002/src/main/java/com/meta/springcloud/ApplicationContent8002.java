package com.meta.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Tang poetry all
 * @Date 2022/6/9 9:54
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan(value = {"com.meta.springcloud.dao"})
public class ApplicationContent8002 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationContent8002.class,args);
    }
}
