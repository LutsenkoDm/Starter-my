package ru.test.starter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.test.starter.service.MyService;

@Configuration
public class StarterMyConfiguration {

    @Bean
    public MyService myService() {
        return new MyService();
    }
}
