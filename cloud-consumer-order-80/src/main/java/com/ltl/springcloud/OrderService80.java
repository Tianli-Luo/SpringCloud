package com.ltl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author ltl
 * @Classname OrderServiceApplication
 * @Description TODO
 * @Date 2020/6/5 20:04
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MyLBRule.class)
public class OrderService80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderService80.class,args);
    }
}
