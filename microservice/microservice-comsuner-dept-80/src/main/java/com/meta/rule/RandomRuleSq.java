package com.meta.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author Tang poetry all
 * @Date 2022/6/9 15:35
 */
public class RandomRuleSq extends AbstractLoadBalancerRule {

    /**
     * 总共被调用的次数
     */
    private AtomicInteger total = new AtomicInteger();

    /**
     * 当前提供服务的机器号
     */
    private AtomicInteger currentIndex = new AtomicInteger();

    /**
     * 所有的服务器被调用5次之后再切换
     */
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            List<Server> upList = lb.getReachableServers();
            List<Server> allList = lb.getAllServers();

            int serverCount = allList.size();
            if (serverCount == 0) {

                return null;
            }


            //先判断调用次数是否小于5次
            if (total.get() < 5){

               //小于5次的话就意味着当前服务实例还可以继续调用
               server =  upList.get(currentIndex.get());

               //调用完之后将调用次数加一
               total.incrementAndGet();
            }else {

                //大于5次就意味着服务调用次数已经达到上限，需要将调用次数清空
                total.set(0);

                //并且将服务下标加一，且需要判断下标数是否超过了存活服务数量
                if (currentIndex.incrementAndGet() >= upList.size()){

                    //如果大于存活数量的话就需要将它清空，从新开始调用
                    currentIndex.set(0);

                }

            }

            if (server == null) {

                Thread.yield();
                continue;
            }

            if (server.isAlive()) {
                return (server);
            }


            server = null;
            Thread.yield();
        }

        return server;

    }

    protected int chooseRandomInt(int serverCount) {
        return ThreadLocalRandom.current().nextInt(serverCount);
    }

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }
}
