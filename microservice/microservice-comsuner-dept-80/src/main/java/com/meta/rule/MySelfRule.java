package com.meta.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Tang poetry all
 * @Date 2022/6/9 15:03
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule rule(){
        //return new RandomRule();
        //自定义选择算法，每个服务被调用5次
        return new RandomRuleSq();
    }
}
