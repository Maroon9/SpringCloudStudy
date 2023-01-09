package com.xzw.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author maroon
 * @date 2022/11/23 17:31
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class CloudalibabaConsumerNacosOrder84 {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaConsumerNacosOrder84.class, args);
    }

}
