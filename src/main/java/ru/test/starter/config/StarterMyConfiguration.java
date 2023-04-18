package ru.test.starter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.test.starter.interceptors.HeaderInterceptor;

@Configuration
public class StarterMyConfiguration {

    @Bean
    public HeaderInterceptor headerInterceptor() {
        return new HeaderInterceptor();
    }
}
