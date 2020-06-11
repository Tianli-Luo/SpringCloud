package com.ltl.springcloud.service;

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

    public String fallback(){
        return "fallback";
    }

}
