package com.meta.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author Tang poetry all
 * @Date 2022/6/10 9:38
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.meta.springcloud"})
public class ApplicationContextConsumerFeign {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationContextConsumerFeign.class,args);
    }
}
