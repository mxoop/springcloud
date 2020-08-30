package com.liaokuo.springcloud;

import com.liaokuo.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Created by Rain on 2020/8/18.
 */
//在微服务启动的时候去加载我们自定义的Ribbon类
@RibbonClient(name = "myRibbon",configuration = MyRule.class)
@EnableEurekaClient
@SpringBootApplication
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class);
    }
}
