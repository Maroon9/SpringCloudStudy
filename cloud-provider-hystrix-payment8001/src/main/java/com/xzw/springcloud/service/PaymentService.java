package com.xzw.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import static java.lang.Thread.*;

/**
 * @author maroon
 * @date 2022/11/11 16:32
 */
@Service
public class PaymentService {

    public String paymentInfoOK(Integer id) {
        return "线程池：" + currentThread().getName() + "paymentInfoOK,id："+ id + "\t" + "O(∩_∩)O哈哈~";
    }

    @HystrixCommand(fallbackMethod = "paymentInfoTimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")})
    public String paymentInfoTimeOut(Integer id) {
        int time = 3000;
        try {
            sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + currentThread().getName() + "paymentInfoTimeOut,id："+ id + "\t" + "O(∩_∩)O哈哈~" + "耗时" + time / 1000 + "秒";
    }
    public String paymentInfoTimeOutHandler(Integer id)  {
        return "线程池：" + currentThread().getName() + "paymentInfoTimeOutHandler,id："+ id + "\t" + "o(╥﹏╥)o";
    }
}
