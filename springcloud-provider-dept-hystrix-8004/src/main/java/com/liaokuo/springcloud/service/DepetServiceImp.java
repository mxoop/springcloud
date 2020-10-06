package com.liaokuo.springcloud.service;

import com.liaokuo.springcloud.dao.DeptDao;
import com.liaokuo.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rain on 2020/10/6.
 */
@Service
public class DepetServiceImp implements DepetService{
    @Autowired
    private DeptDao deptDao;
    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryDept(Long id) {
        return deptDao.queryDept(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
