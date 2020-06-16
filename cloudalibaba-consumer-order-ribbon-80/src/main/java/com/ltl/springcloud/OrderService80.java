package com.ltl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author ltl
 * @Classname OrderServiceApplication
 * @Description TODO
 * @Date 2020/6/5 20:04
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderService80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderService80.class,args);
    }
}
