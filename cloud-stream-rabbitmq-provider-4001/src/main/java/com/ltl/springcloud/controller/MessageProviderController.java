package com.ltl.springcloud.controller;

import com.ltl.springcloud.service.impl.MessageProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ltl
 * @Classname MessageProviderController
 * @Description TODO
 * @Date 2020/6/13 11:48
 */
@RestController
public class MessageProviderController {

    @Autowired
    MessageProviderImpl messageProvider;

    @GetMapping("message")
    public String send(){
        return messageProvider.send();
    }
}
