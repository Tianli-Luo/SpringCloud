package com.ltl.springcloud.custom;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ltl
 * @Classname CustomLBRue
 * @Description TODO
 * @Date 2020/6/7 22:03
 */
@Component
@Slf4j
public class CustomLBRule {
    private final AtomicInteger count = new AtomicInteger(0);

    private Integer getAndIncrement(){
        int current,next;
        do{
            current = count.get();
            next = current >= Integer.MAX_VALUE ? 0 : current+1;
        }while (!count.compareAndSet(current,next));
        log.info("count:{}",next);
        return next;
    }

    public ServiceInstance getInstance(List<ServiceInstance> instances){
        int index = getAndIncrement() % instances.size();
        return instances.get(index);
    }
}
