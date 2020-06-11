package com.ltl.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

/**
 * @author ltl
 * @Classname PaymentService
 * @Description TODO
 * @Date 2020/6/10 22:49
 */
@Service
public class PaymentService {

    @HystrixCommand(fallbackMethod = "fallback")
    public String ok(){
        return "ok";
    }


    @HystrixCommand(fallbackMethod = "fallback",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1000")
    })
    public String error(){
//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        int i = 1/0;
        return "error";
    }


    @HystrixCommand(fallbackMethod = "fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
    })
    public String error(int id){
        if (id < 0){
            throw new RuntimeException("id不能小于零");
        }
        return IdUtil.simpleUUID()+"  "+id;
    }


    public String fallback(int id){
        return "fallback  "+id;
    }

    public String fallback(){
        return "fallback";
    }

}
