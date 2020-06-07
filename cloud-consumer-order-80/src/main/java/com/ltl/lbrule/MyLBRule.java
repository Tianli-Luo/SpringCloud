package com.ltl.lbrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ltl
 * @Classname MyLBRule
 * @Description TODO
 * @Date 2020/6/7 17:18
 */
@Configuration
public class MyLBRule {

    @Bean(name = "LBRule")
    public IRule myLBRule(){
        return new RandomRule();
    }
}
