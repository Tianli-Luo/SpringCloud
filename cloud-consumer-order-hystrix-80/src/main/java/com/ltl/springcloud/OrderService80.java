package com.ltl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ltl
 * @Classname OrderService80
 * @Description TODO
 * @Date 2020/6/10 23:20
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderService80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderService80.class,args);
    }
}
