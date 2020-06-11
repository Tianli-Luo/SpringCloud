package com.ltl.springcloud.service.impl;

import com.ltl.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author ltl
 * @Classname PaymentServiceImpl
 * @Description TODO
 * @Date 2020/6/10 23:52
 */
@Component
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String isOk() {
        return "okFallback";
    }

    @Override
    public String isError() {
        return "errorFallback";
    }


}
