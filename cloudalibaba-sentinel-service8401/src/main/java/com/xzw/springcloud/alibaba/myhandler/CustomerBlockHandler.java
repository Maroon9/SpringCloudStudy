package com.xzw.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.xzw.springcloud.entities.CommonResult;
import com.xzw.springcloud.entities.Payment;

/**
 * @author maroon
 * @date 2022/11/23 17:02
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult<>(4444, "按用户自定义,global handlerException-----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult<>(4444, "按用户自定义,global handlerException-----2");
    }
}
