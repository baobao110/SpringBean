package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String []args){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
      /* *//* 方法1 自动注解*//*
        Person person=(Person)context.getBean("person");
        person.print();*/

      /*  *//*方法2 手动配置xml*//*
        Book book=(Book)context.getBean("book");
        book.print();*/
        /*方法3 基于Java类的bean定义 */
        Dog dog=(Dog)context.getBean("dog");
       dog.print();
    }
}
