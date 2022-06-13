package com.meta.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Tang poetry all
 * @Date 2022/6/12 18:42
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigEurekaClientGit {
    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaClientGit.class,args);
    }
}
