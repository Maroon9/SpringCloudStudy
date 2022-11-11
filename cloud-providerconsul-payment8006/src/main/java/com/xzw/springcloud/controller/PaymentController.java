package com.xzw.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author maroon
 * @date 2022/9/24 19:42
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String severPort;

    @RequestMapping("/payment/consul")
    public String paymentConsul() {
        return "SpringCloud with consul: " +severPort + "\t" + UUID.randomUUID().toString();
    }
}
