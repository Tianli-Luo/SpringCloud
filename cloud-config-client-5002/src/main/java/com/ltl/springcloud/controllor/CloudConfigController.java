package com.ltl.springcloud.controllor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ltl
 * @Classname CloudConfigController
 * @Description TODO
 * @Date 2020/6/12 22:19
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class CloudConfigController {


    @Value("${server.info}")
    private String config;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return config;
    }
}
