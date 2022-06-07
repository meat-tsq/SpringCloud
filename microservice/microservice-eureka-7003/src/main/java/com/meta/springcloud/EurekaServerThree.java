package com.meta.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Tang poetry all
 * @Date 2022/6/7 15:58
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerThree {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerThree.class,args);
    }
}
