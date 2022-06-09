package com.meta.springcloud.service.impl;

import com.meta.springcloud.dao.DeptDao;
import com.meta.springcloud.entites.Dept;
import com.meta.springcloud.service.DeptService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Tang poetry all
 * @Date 2022/6/6 9:52
 */
@Service
public class DeptServiceImpl implements DeptService {
    private DeptDao dao;

    public DeptServiceImpl(DeptDao dao) {
        this.dao = dao;
    }


    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public boolean del(Integer id) {
        return dao.deleteDeptById(id);
    }

    @Override
    public boolean update(Dept dept) {
        return dao.updateDept(dept);
    }

    @Override
    public Dept get(Integer id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findByAll();
    }
}
