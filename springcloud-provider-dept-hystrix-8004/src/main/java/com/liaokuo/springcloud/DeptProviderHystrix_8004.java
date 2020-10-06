package com.liaokuo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Rain on 2020/10/6.
 */
@EnableCircuitBreaker   //  熔断
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class DeptProviderHystrix_8004 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix_8004.class);
    }
}
