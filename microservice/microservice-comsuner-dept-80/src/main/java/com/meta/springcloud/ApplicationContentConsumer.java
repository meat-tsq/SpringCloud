package com.meta.springcloud;

import com.meta.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author Tang poetry all
 * @Date 2022/6/6 12:55
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICE-DEPT",configuration = MySelfRule.class)
public class ApplicationContentConsumer {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationContentConsumer.class,args);
    }
}
