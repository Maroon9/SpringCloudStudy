package com.xzw.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author maroon
 * @date 2022/11/9 15:59
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myrule() {
        return new RandomRule();
    }
}
