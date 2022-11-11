package com.xzw.springcloud.service;

import com.xzw.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author maroon
 * @date 2022/9/19 18:12
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") long id);
}
