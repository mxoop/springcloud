package com.liaokuo.springcloud.service;

import com.liaokuo.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created by Rain on 2020/8/31.
 */
@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept);
    @GetMapping("/dept/get/{id}")
    public Dept queryDept(@PathVariable("id")Long id);
    @GetMapping("/dept/list")
    public List<Dept> queryAll();
}
