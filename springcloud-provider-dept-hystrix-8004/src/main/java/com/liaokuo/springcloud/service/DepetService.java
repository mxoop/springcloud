package com.liaokuo.springcloud.service;

import com.liaokuo.springcloud.pojo.Dept;

import java.util.List;

/**
 * Created by Rain on 2020/10/6.
 */
public interface DepetService {
    public boolean addDept(Dept dept);

    public Dept queryDept(Long id);

    public List<Dept> queryAll();
}
