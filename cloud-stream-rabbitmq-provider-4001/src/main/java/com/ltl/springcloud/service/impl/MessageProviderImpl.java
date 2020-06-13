package com.ltl.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.ltl.springcloud.service.MessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

/**
 * @author ltl
 * @Classname MessageProviderImpl
 * @Description TODO
 * @Date 2020/6/13 11:40
 */

@EnableBinding(Source.class)
@Slf4j
public class MessageProviderImpl implements MessageProvider {

    @Autowired
    private MessageChannel output;

    @Override
    public String send() {
        String uuid = IdUtil.simpleUUID();
        output.send(MessageBuilder.withPayload(uuid).build());
        log.info(uuid);
        return uuid;
    }
}
