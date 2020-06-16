package com.ltl.springcloud.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author ltl
 * @Classname FilterContextConfig
 * @Description TODO
 * @Date 2020/6/15 17:22
 */
//@Configuration
public class FilterContextConfig {
    @Bean
    public FilterRegistrationBean sentinelFilterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(new CommonFilter());
//        registration.addUrlPatterns("/*");
//        // 入口资源关闭聚合
//        registration.addInitParameter(CommonFilter.WEB_CONTEXT_UNIFY, "false");
//        registration.setName("sentinelFilter");
//        registration.setOrder(1);
//        return registration;
        return null;
    }
}
