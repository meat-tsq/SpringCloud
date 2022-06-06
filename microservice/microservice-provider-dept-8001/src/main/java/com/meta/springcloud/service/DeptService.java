package com.meta.springcloud.service;

import com.meta.springcloud.entites.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Tang poetry all
 * @Date 2022/6/6 9:51
 */
public interface DeptService {

    /**
     * 添加部门
     * @param dept 需要添加的部门
     * @return
     */
    boolean add(Dept dept);

    /**
     * 根据部门id删除
     * @param id 需要被删除的部门ID
     * @return
     */
    boolean del(@Param("id") Integer id);

    /**
     * 修改部门
     * @param dept 需要修改的部门
     * @return
     */
    boolean update(Dept dept);

    /**
     * 根据id查询部门
     * @param id 部门id
     * @return
     */
    Dept get(@Param("id") Integer id);

    /**
     * 查询所有的部门
     * @return 部门集合
     */
    List<Dept> list();
}
