package com.ltl.springcloud.controller;

import com.ltl.springcloud.domain.Order;
import com.ltl.springcloud.entities.CommonResult;
import com.ltl.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Tianly
 */
@RestController
public class OrderController
{
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult<?> create(Order order)
    {
        orderService.create(order);
        return new CommonResult<>(200,"订单创建成功");
    }
}
