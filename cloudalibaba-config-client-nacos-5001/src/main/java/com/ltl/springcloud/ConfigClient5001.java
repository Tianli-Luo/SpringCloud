package com.ltl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ltl
 * @Classname ConfigClient5001
 * @Description TODO
 * @Date 2020/6/13 22:32
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClient5001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient5001.class,args);
    }
}
