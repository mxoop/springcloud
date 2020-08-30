package com.liaokuo.spingcloud.controller;

import com.liaokuo.springcloud.pojo.Dept;
import com.liaokuo.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Rain on 2020/8/18.
 */
@RestController
public class DeptConsumerController {
    @Autowired
    private DeptClientService service = null;

    @RequestMapping("consumer/dept/add")
    public boolean add(Dept dept){
        return this.service.addDept(dept);
    }

    @RequestMapping("consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return this.service.queryDept(id);
    }

    @RequestMapping("consumer/dept/list")
    public List<Dept> list(){
        return this.service.queryAll();
    }
}
