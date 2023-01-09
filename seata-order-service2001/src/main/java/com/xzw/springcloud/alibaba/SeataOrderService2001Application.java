package com.xzw.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author maroon
 * @date 2023/1/9 20:22
 *
 *  exclude = DataSourceAutoConfiguration.class 取消数据源的自动创建,
 *  读取自定义的DataSourceProxyConfig.class类，使用Seata对数据源进行代理
 *  @EnableDiscoveryClient 该注解用于向使用consul或者zookeeper作为注册中心时注册服务
 *
 *
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SeataOrderService2001Application {

    public static void main(String[] args) {
        SpringApplication.run(SeataOrderService2001Application.class, args);
    }

}
