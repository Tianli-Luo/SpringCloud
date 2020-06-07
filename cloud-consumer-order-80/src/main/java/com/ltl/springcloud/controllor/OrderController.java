package com.ltl.springcloud.controllor;

import com.ltl.springcloud.custom.CustomLBRule;
import com.ltl.springcloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
    private RestTemplate restTemplate;
    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE/payment/";

    @Autowired
    CustomLBRule rule;

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/{id}")
    public CommonResult<?> getOrderById(@PathVariable("id")Long id){
        return restTemplate.getForObject(PAYMENT_URL+id,CommonResult.class);
    }

    @GetMapping("/lb/{id}")
    public Object getOrderById1(@PathVariable("id")Long id){
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if (instances == null || instances.size() == 0){
            return null;
        }
        ServiceInstance instance = rule.getInstance(instances);
        return instance.getPort();
    }
}
