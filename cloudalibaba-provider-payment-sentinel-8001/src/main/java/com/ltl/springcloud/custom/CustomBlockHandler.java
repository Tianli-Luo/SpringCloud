package com.ltl.springcloud.custom;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author ltl
 * @Classname CustomBlockHandler
 * @Description TODO
 * @Date 2020/6/16 11:39
 */
public class CustomBlockHandler {

    public static String handler1(int a,BlockException e){
        return "handler1";
    }
}
