package com.ltl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ltl
 * @Classname ConfigServer5001
 * @Description TODO
 * @Date 2020/6/12 21:30
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigServer5001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer5001.class,args);
    }
}
