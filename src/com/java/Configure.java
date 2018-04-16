package com.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*3 基于Java类的bean定义*/
@Configuration
public class Configure {

    @Bean("dog")
    public Dog init(){
        Dog dog=new Dog();
        dog.setName("3333");
        return dog;
    }
}
