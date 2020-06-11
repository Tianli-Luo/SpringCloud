package com.ltl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ltl
 * @Classname HystrixDashBoadr
 * @Description TODO
 * @Date 2020/6/11 12:01
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoard {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoard.class,args);
    }
}
