package com.ltl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ltl
 * @Classname PaymentServiceApplication
 * @Description TODO
 * @Date 2020/6/5 17:22
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentService8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentService8004.class,args);
    }
}
