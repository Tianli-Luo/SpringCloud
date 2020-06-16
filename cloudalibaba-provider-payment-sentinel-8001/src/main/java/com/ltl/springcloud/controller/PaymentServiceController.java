package com.ltl.springcloud.controller;

import cn.hutool.core.util.IdUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ltl.springcloud.custom.CustomBlockHandler;
import com.ltl.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ltl
 * @Classname PaymentServiceController
 * @Description TODO
 * @Date 2020/6/15 11:25
 */

@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentServiceController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/{id}")
    public String getPayment(@PathVariable("id")Integer id){
        return "payment:"+id;
    }

    @GetMapping("/ok")
    public String ok(){
        return IdUtil.simpleUUID();
    }

    @GetMapping("/test")
    public String test(){
        return IdUtil.simpleUUID();
    }

    @GetMapping("/a")
    public String a(){
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        int a= 1/0;
        log.info("---------------------a-------------------------");
        return IdUtil.simpleUUID()+paymentService.getPayment()+"  a";
    }

    @GetMapping("/b")
    public String b(){
        return IdUtil.simpleUUID()+paymentService.getPayment()+"  b";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandlerClass = CustomBlockHandler.class,blockHandler = "handler1")
    public String testHotKey(@RequestParam(value = "a" ,required = false) int a){
        log.info("=====================");
        return IdUtil.simpleUUID()+paymentService.getPayment();
    }

    public String blockHandler(String p1, BlockException e){
        return "blockHandler";
    }


}
