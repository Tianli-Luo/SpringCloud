package com.ltl.springcloud.controller;

import com.ltl.springcloud.entities.CommonResult;
import com.ltl.springcloud.entities.Payment;
import com.ltl.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ltl
 * @Classname OrderController
 * @Description TODO
 * @Date 2020/6/10 20:15
 */

@RestController
@RequestMapping("/consumer/order")
public class OrderController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/{id}")
    public CommonResult<Payment> getOrderById(@PathVariable("id") Long id){
        return paymentService.getById(id);
    }
    @GetMapping("/timeout")
    public String timeout(){
        return paymentService.timeout();
    }
}
