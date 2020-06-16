package com.ltl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ltl
 * @Classname OrderService
 * @Description TODO
 * @Date 2020/6/16 22:28
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class OrderService80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderService80.class,args);
    }
}
