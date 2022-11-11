package com.xzw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author maroon
 * @date 2022/11/7 19:48
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或zookeeper作为注册中心时服务
public class OrderConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain80.class, args);
    }
}
