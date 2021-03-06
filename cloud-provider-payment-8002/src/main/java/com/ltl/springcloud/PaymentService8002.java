package com.ltl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ltl
 * @Classname PaymentServiceApplication
 * @Description TODO
 * @Date 2020/6/5 17:22
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentService8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentService8002.class,args);
    }
}
