package com.ltl.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ltl
 * @Classname OpenfeignConfig
 * @Description TODO
 * @Date 2020/6/10 20:46
 */
@Configuration
public class OpenfeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
