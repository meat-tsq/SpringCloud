package com.meta.springcloud.controller;

import com.meta.springcloud.entites.Dept;
import com.meta.springcloud.service.DeptService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Tang poetry all
 * @Date 2022/6/6 9:56
 */
@RestController
public class DeptController {
    private DeptService service;

    public DeptController(DeptService service) {
        this.service = service;
    }

    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept){
        return service.add(dept);
    }

    @DeleteMapping("/dept/delete")
    public boolean delete(@RequestBody Integer deptno){
        return service.del(deptno);
    }

    @PutMapping("/dept/put")
    public boolean put(@RequestBody Dept dept){
        return service.update(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable(value = "id") Integer id){
        return service.get(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> list(){
        return service.list();
    }
}
