package com.ltl.springcloud.config;

import com.alibaba.csp.sentinel.adapter.servlet.callback.RequestOriginParser;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ltl
 * @Classname CoustomQequestOriginParse
 * @Description TODO
 * @Date 2020/6/16 12:16
 */
@Component
public class CustomRequestOriginParse implements RequestOriginParser {
    @Override
    public String parseOrigin(HttpServletRequest request) {
        String from = request.getParameter("from");
        if (StringUtils.isEmpty(from)){
            throw new RuntimeException("from参数不能为空");
        }
        return from;
    }
}
