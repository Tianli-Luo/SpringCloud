package com.ltl.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author ltl
 * @Classname MessageConsumerController
 * @Description TODO
 * @Date 2020/6/13 15:06
 */

@Component
@EnableBinding(Sink.class)
@Slf4j
public class MessageConsumerController {

    @StreamListener(Sink.INPUT)
    public void getMessage(Message<String> message){
        String s = message.getPayload();
        log.info(s);
    }

}
