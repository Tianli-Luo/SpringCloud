package com.ltl.springcloud.controllor;

import com.ltl.springcloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ltl
 * @Classname OrderController
 * @Description TODO
 * @Date 2020/6/5 20:04
 */

@Slf4j
@RestController
@RequestMapping("/consumer/order")
public class OrderController {



    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/{id}")
    public CommonResult<?> getOrderById(@PathVariable("id")Long id){
       return restTemplate.getForObject("http://cloud-payment-service/payment/" + id, CommonResult.class);
    }

}
