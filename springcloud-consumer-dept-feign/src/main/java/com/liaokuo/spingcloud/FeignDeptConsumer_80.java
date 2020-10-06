package com.liaokuo.spingcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by Rain on 2020/8/18.
 */
//@ComponentScan("com.liaokuo.springcloud") 与@SpringBootApplication同时用会导致@SpringBootApplication失效，报404
@EnableFeignClients(basePackages = {"com.liaokuo.springcloud"})
@EnableEurekaClient
@SpringBootApplication
public class FeignDeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_80.class);
    }
}
