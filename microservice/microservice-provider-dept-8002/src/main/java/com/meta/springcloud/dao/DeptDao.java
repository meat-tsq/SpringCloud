package com.meta.springcloud.dao;

import com.meta.springcloud.entites.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Tang poetry all
 * @Date 2022/6/9 9:54
 */
@Mapper
public interface DeptDao {

    /**
     * 删除部门
     * @param dept 需要删除的部门
     * @return
     */
    boolean addDept(Dept dept);

    /**
     * 根据部门id删除
     * @param id 需要被删除的部门ID
     * @return
     */
    boolean deleteDeptById(@Param("id") Integer id);

    /**
     * 修改部门
     * @param dept 需要修改的部门
     * @return
     */
    boolean updateDept(Dept dept);

    /**
     * 根据id查询部门
     * @param id 部门id
     * @return
     */
    Dept findById(@Param("id") Integer id);

    /**
     * 查询所有的部门
     * @return 部门集合
     */
    List<Dept> findByAll();
}
