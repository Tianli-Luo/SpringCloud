package com.ltl.springcloud.controller;

import com.ltl.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author ltl
 * @Classname OrderController
 * @Description TODO
 * @Date 2020/6/10 23:23
 */
@RestController
@RequestMapping("/consumer/order")
//@DefaultProperties(defaultFallback = "defaultFallback")
public class OrderController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/ok")
    public String ok(){
        return paymentService.isOk();
    }

    @GetMapping("/error")
    public String error(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return paymentService.isError();
    }

    public String defaultFallback(){
        return "defaultFallback";
    }
}
