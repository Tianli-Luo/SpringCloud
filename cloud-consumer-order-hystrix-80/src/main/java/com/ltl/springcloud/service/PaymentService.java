package com.ltl.springcloud.service;


import com.ltl.springcloud.service.impl.PaymentServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Tianly
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE" ,fallback = PaymentServiceImpl.class)
public interface PaymentService {

    @GetMapping("/payment/ok")
    String isOk();

    @GetMapping("/payment/error")
    String isError();
}
