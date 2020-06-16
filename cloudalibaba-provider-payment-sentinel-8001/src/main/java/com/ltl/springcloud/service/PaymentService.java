package com.ltl.springcloud.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author ltl
 * @Classname PaymentService
 * @Description TODO
 * @Date 2020/6/15 15:39
 */

@Service
public class PaymentService {

    @SentinelResource("PaymentService")
    public String getPayment(){
        return "paymentService";
    }
}
