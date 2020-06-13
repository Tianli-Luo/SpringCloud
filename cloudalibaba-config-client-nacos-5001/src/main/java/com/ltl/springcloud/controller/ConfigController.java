package com.ltl.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ltl
 * @Classname ConfigController
 * @Description TODO
 * @Date 2020/6/13 22:33
 */
@RestController
@RefreshScope
@RequestMapping("/config")
public class ConfigController {

    @Value("${config.info}")
    String configInfo;

    @GetMapping("/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
