package com.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("person")
public class Person {

    @Value("李四")
    private String name;

    public void print(){
        System.out.println(name);
    }
}
