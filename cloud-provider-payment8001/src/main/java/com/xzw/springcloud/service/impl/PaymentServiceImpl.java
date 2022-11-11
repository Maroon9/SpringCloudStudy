package com.xzw.springcloud.service.impl;

import com.xzw.springcloud.dao.PaymentDao;
import com.xzw.springcloud.entities.Payment;
import com.xzw.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author maroon
 * @date 2022/9/19 18:13
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
