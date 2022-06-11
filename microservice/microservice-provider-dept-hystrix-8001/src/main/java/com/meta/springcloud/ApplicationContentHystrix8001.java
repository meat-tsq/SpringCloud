package com.meta.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Tang poetry all
 * @Date 2022/6/6 9:24
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan(value = {"com.meta.springcloud.dao"})
@EnableCircuitBreaker
public class ApplicationContentHystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationContentHystrix8001.class,args);
    }
}
