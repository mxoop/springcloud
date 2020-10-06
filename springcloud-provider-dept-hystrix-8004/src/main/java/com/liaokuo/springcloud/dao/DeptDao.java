package com.liaokuo.springcloud.dao;

import com.liaokuo.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Rain on 2020/10/6.
 */
@Mapper
@Repository
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept queryDept(Long id);

    public List<Dept> queryAll();
}
