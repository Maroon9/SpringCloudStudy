package com.xzw.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author maroon
 * @date 2022/11/23 17:49
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaProviderPayment9004 {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9004.class, args);
    }

}
