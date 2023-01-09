package com.xzw.springcloud.alibaba.service;

import com.xzw.springcloud.entities.CommonResult;
import com.xzw.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author maroon
 * @date 2022/11/23 17:34
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
