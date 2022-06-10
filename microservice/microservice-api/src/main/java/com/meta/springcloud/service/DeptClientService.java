package com.meta.springcloud.service;

import com.meta.springcloud.entites.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @Author Tang poetry all
 * @Date 2022/6/10 9:56
 */
@FeignClient(name = "MICROSERVICE-DEPT")
public interface DeptClientService {

    @GetMapping("/dept/list")
    public List<Dept> list();

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id")Integer id);

    @PostMapping(value = "/dept/add")
    public boolean add( Dept dept);
}
