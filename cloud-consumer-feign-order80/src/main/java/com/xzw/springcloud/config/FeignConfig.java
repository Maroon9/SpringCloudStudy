package com.xzw.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author maroon
 * @date 2022/11/11 15:43
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLever() {
        return Logger.Level.FULL;
    }
}
