package com.ltl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ltl
 * @Classname com.ltl.springcloud.PaymentService8001
 * @Description TODO
 * @Date 2020/6/10 22:32
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
public class PaymentService8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentService8001.class,args);
    }
}
