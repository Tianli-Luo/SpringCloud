package com.ltl.springcloud.controllor;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ltl.springcloud.entities.CommonResult;
import com.ltl.springcloud.order.OrderService;
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

    @Autowired
    OrderService orderService;

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/{id}")
    @SentinelResource(value = "order",fallback = "fallbackM",blockHandler = "blockHandlerM")
    public CommonResult<?> getOrderById(@PathVariable("id")Long id){
        if (id == 3){
            throw new RuntimeException("order not found");
        }
       return orderService.getById(id);
    }

    public CommonResult<?> blockHandlerM(@PathVariable("id")Long id, BlockException e){
        return new CommonResult<>(500,"流量过大，请稍后再试",e.getMessage());
    }

    public CommonResult<?> fallbackM(@PathVariable("id")Long id, Throwable e){
        return new CommonResult<>(500,"此订单不存在："+id,e.getMessage());
    }

}
