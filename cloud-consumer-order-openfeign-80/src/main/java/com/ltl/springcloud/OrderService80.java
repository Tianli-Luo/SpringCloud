package com.ltl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ltl
 * @Classname OrderService80
 * @Description TODO
 * @Date 2020/6/10 20:16
 */
@SpringBootApplication
@EnableFeignClients
public class OrderService80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderService80.class,args);
    }
}
