package com.ltl.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tianly
 * @create 2019-12-11 16:57
 */
@Configuration
@MapperScan({"com.ltl.springcloud.dao"})
public class MyBatisConfig {
}
