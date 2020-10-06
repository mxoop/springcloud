package com.liaokuo.springcloud.service;

import com.liaokuo.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Rain on 2020/10/7.
 */
//  降级
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept queryDept(Long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDname("id=>"+id+"没有对应信息，客户端提供降级的信息，这个服务已经被关闭")
                        .setDb_source("no database in Mysql");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }
        };
    }
}
