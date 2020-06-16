package com.ltl.springcloud.order;

import com.ltl.springcloud.entities.CommonResult;
import com.ltl.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("cloud-payment-service")
@RequestMapping("/payment")
public interface OrderService {

    @GetMapping("/{id}")
    CommonResult<Payment> getById(@PathVariable("id") Long id);
}
