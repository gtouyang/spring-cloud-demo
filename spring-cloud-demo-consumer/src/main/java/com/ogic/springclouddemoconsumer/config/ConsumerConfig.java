package com.ogic.springclouddemoconsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConsumerConfig {

    @Bean
    public RestTemplate initRestTemplate(){
        return new RestTemplate();
    }
}
