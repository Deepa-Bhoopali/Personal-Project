package com.myfirstspring.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWordConfiguration {

    // Things which are managed by spring framework are called beans
    // We can define beans using @Bean annotation

    @Bean
    public String name() {
        return "Deepa";
    }

}
