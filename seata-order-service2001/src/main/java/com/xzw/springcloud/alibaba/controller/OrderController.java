package com.xzw.springcloud.alibaba.controller;

import com.xzw.springcloud.alibaba.domain.CommonResult;
import com.xzw.springcloud.alibaba.domain.Order;
import com.xzw.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author maroon
 * @date 2023/1/9 20:29
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
