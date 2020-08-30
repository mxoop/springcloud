package com.liaokuo.springcloud.controller;

import com.liaokuo.springcloud.pojo.Dept;
import com.liaokuo.springcloud.service.DepetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Rain on 2020/8/18.
 */
@RestController
public class DeptController {
    @Autowired
    private DepetService depetService;

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept){
        return depetService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return depetService.queryDept(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll(){
        return depetService.queryAll();
    }

    @RequestMapping("/dept/discovery")
    public Object discovery(){
        List<String> services = client.getServices();
        System.out.println("discovery==>services"+services);

        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        //  serviceId为 application.name
        for (ServiceInstance instance : instances){
            System.out.println(
                    instance.getHost()+"\t"+
                    instance.getInstanceId()+"\t"+
                    instance.getPort()+"\t"+
                    instance.getUri()+"\t"+
                    instance.getServiceId()
            );
        }
        return this.client;
    }
}
