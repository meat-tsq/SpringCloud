package com.meta.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Tang poetry all
 * @Date 2022/6/6 11:56
 */
@Configuration
public class ConfigBean {

    /**
     * RestTemplate提供了多种便携访问远程Http服务的方法
     * 是一种简单的便捷额访问restFull服务模板类，是Spring提供用于访问Rest服务的客户端模板工具集
     * @LoadBalanced 负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate;
    }

    @Bean
    public IRule iRule(){
       // return new RandomRule(); 随机算法
       // return new RoundRobinRule(); 轮询算法
       return new RetryRule();
    }
}
