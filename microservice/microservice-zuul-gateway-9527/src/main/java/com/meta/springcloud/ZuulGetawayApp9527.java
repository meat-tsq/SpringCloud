package com.meta.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author Tang poetry all
 * @Date 2022/6/12 9:35
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulGetawayApp9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGetawayApp9527.class,args);
    }
}
