package com.xzw.springcloud.alibaba.service;

import com.xzw.springcloud.alibaba.domain.Order;

/**
 * @author maroon
 * @date 2023/1/9 20:27
 */
public interface OrderService {
    void create(Order order);
}