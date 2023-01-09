package com.xzw.springcloud.alibaba.service;

/**
 * @author maroon
 * @date 2023/1/9 20:36
 */
public interface StorageService {
    /**
     * 扣减库存
     *
     * @param productId
     * @param count
     */
    void decrease(Long productId, Integer count);
}
