package com.xzw.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author maroon
 * @date 2022/11/11 20:10
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfoOK(Integer id) {
        return "----PaymentFallbackService Fallback-paymentInfoOK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "----PaymentFallbackService Fallback-paymentInfoTimeOut,o(╥﹏╥)o";
    }
}
