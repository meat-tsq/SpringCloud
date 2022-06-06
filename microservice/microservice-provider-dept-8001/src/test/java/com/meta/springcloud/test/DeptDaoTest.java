package com.meta.springcloud.test;

import com.meta.springcloud.dao.DeptDao;
import com.meta.springcloud.entites.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author Tang poetry all
 * @Date 2022/6/6 9:19
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DeptDaoTest {
     @Autowired
    private DeptDao dao;

     @Test
    public void testDemo01(){
         List<Dept> byAll = dao.findByAll();

         byAll.stream().forEach(System.out::println);
     }
}
