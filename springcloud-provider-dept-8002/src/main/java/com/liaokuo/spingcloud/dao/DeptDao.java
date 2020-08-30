package com.liaokuo.spingcloud.dao;

import com.liaokuo.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Rain on 2020/8/18.
 */
@Mapper
@Repository
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept queryDept(Long id);

    public List<Dept> queryAll();
}
