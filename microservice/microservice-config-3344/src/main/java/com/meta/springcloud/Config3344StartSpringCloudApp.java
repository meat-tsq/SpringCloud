package com.meta.springcloud;

import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author Tang poetry all
 * @Date 2022/6/12 13:41
 */
@SpringBootApplication
@EnableConfigServer
public class Config3344StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Config3344StartSpringCloudApp.class,args);
    }
}
