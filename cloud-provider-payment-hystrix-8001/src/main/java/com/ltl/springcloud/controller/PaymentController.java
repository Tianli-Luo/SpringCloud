package com.ltl.springcloud.controller;

import com.ltl.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author ltl
 * @Classname PaymentController
 * @Description TODO
 * @Date 2020/6/10 22:33
 */

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/ok")
    public String isOk(){
        return paymentService.ok();
    }

    @GetMapping("/error")
    public String isError(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return paymentService.error();
    }
}
