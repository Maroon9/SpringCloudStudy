package com.xzw.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author maroon
 * @date 2022/11/23 17:42
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaProviderPayment9003 {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9003.class, args);
    }

}
