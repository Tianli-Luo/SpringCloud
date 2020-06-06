package com.ltl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ltl
 * @Classname PaymentServiceApplication
 * @Description TODO
 * @Date 2020/6/5 17:22
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentService8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentService8001.class,args);
    }
}
