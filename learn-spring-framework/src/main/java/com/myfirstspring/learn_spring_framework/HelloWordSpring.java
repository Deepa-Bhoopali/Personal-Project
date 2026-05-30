package com.myfirstspring.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWordSpring {
    public static void main(String[] args) {
        // 1 : launch a spring context

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                HelloWordConfiguration.class);
        // 2 : configure the things that we want spring to manage - @Configuration
        System.out.println(context.getBean("name"));

    }

}
