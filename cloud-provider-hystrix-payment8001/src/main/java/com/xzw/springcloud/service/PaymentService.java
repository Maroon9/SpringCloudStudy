package com.xzw.springcloud.service;

import cn.hutool.core.util.IdUtil;
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

    //----服务熔断

    @HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"), //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),//失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(Integer id) {
        if(id < 0) {
            throw new RuntimeException("*****id不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t" + "调用成功,流水号" + serialNumber;
    }

    public String paymentCircuitBreakerFallback(Integer id) {
        return "id不能为负数，请稍后再试，o(╥﹏╥)o  id：" + id;
    }
}
