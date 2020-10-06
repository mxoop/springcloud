package com.liaokuo.springcloud.controller;

import com.liaokuo.springcloud.pojo.Dept;
import com.liaokuo.springcloud.service.DepetService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Rain on 2020/8/18.
 */
@RestController
public class DeptController {
    @Resource
    private DepetService depetService;

    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept){
        return depetService.addDept(dept);
    }

    @HystrixCommand(fallbackMethod = "hystrixGet")
    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = depetService.queryDept(id);
        if(dept == null){
            throw new RuntimeException("id=>"+id+"不存在该用户！");
        }
        return dept;
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll(){
        return depetService.queryAll();
    }

    //  备选方法
    public Dept hystrixGet(@PathVariable("id") Long id){
        return new Dept()
                .setDeptno(id)
                .setDname("id=>"+id+"不存在该用户！@Hystrix")
                .setDb_source("no this database in Mysql");
    }


}
