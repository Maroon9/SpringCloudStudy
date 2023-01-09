package com.xzw.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @author maroon
 * @date 2023/1/9 20:35
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
