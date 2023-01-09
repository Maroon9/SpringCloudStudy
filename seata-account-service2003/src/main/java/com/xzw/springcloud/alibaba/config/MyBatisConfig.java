package com.xzw.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author maroon
 * @date 2023/1/9 20:10
 */
@Configuration
@MapperScan({"com.xzw.springcloud.alibaba.dao"})
public class MyBatisConfig {
}