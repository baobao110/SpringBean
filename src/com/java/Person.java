package com.java;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Person {

    @Autowired
    private Book book;

    public void print(){
        book.print();
    }
}
