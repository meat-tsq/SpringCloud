package com.meta.springcloud.controller;

import com.meta.springcloud.entites.Dept;
import com.meta.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Tang poetry all
 * @Date 2022/6/6 9:56
 */
@RestController
public class DeptController {
    private DeptService service;

    private DiscoveryClient client;

    public DeptController(DeptService service, DiscoveryClient client) {
        this.service = service;
        this.client = client;
    }

    @PostMapping("/dept/add")
    public boolean add( Dept dept){
        return service.add(dept);
    }

    @DeleteMapping("/dept/delete")
    public boolean delete( Integer deptno){
        return service.del(deptno);
    }

    @PutMapping("/dept/put")
    public boolean put(@RequestBody Dept dept){
        return service.update(dept);
    }

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixMethod")
    public Dept get(@PathVariable(value = "id") Integer id){
        Dept dept = service.get(id);

        if (dept==null){
            throw new RuntimeException("ID为"+id+"查询不到");
        }

        return dept;
    }

    @GetMapping("/dept/list")
    public List<Dept> list(){
        return service.list();
    }

    @GetMapping(value = "/dept/discovery")
    public Object discovery(){

        List<String> services = client.getServices();

        System.out.println("********"+services);

        List<ServiceInstance> instances = client.getInstances("microservice-dept");

        for (ServiceInstance serviceInstance : instances){

            System.out.println(serviceInstance.getServiceId()+"\t"+serviceInstance.getHost()+"\t"+serviceInstance.getPort()+"\t"+serviceInstance.getUri());

        }

        return this.client;
    }

    public Dept hystrixMethod(@PathVariable("id") Integer id){
        Dept dept = new Dept();

        dept.setDeptno(id.longValue());

        dept.setDname("该ID:"+id+"没有对应的信息，NUll");

        dept.setDb_source("no this dataBase in MySQL");

        return dept;
    }
}
