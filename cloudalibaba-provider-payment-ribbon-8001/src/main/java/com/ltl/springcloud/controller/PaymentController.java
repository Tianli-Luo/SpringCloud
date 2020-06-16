package com.ltl.springcloud.controller;

import com.ltl.springcloud.entities.CommonResult;
import com.ltl.springcloud.entities.Payment;
import com.ltl.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author ltl
 * @Classname PaymentController
 * @Description TODO
 * @Date 2020/6/5 17:25
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/{id}")
    public CommonResult<Payment> getById(@PathVariable("id") Long id){

        Payment payment = paymentService.getById(id);

        if (payment != null){
            return new CommonResult<>(200,"订单查询成功 serverPort:"+serverPort,payment);
        }else {
            return new CommonResult<>(500,"订单查询失败 serverPort:"+serverPort);
        }
    }




    @GetMapping("/timeout")
    public String timeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "timeout";
    }
}
