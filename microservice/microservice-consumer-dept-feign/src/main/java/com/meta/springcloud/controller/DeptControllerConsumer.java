package com.meta.springcloud.controller;

import com.meta.springcloud.entites.Dept;
import com.meta.springcloud.service.DeptClientService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author Tang poetry all
 * @Date 2022/6/6 12:04
 */
@RestController
public class DeptControllerConsumer {

    @Autowired
    private DeptClientService service = null;


    /*private static final String REST_URL_PREFIX = "http://localhost:8001";
         private static final String REST_URL_PREFIX = "http://MICROSERVICE-DEPT";

      使用：
         使用RestTemplate访问restfull接口非常的简单
         (URL,requestMap,ResponseBean.class)这三个参数分别代表
        REST请求地址，请求参数，HTTP响应转换成的对象类型

    private RestTemplate restTemplate;

    public DeptControllerConsumer(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping(value = "/consumer/dept/add")
    public boolean add( Dept dept){

        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);

    }

    @DeleteMapping(value = "/consumer/dept/del")
    public boolean delete(@RequestBody Integer id){

         restTemplate.delete(REST_URL_PREFIX+"/dept/delete",id);

         return true;
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Integer id){

       return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);

    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list(){

        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);

    }

    @GetMapping("/consumer/dept/discovery")
    public Object discovery(){

        return  restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery",Object.class);

    }
*/

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Integer id){

        return this.service.get(id);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list(){

        return this.service.list();

    }

}
