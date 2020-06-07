package com.ltl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ltl
 * @Classname EurekaServer_7001
 * @Description TODO
 * @Date 2020/6/6 19:53
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002.class,args);
    }
}
