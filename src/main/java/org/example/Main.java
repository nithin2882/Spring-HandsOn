package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle obj = (Vehicle)context.getBean("car");
        obj.drive();
        //System.out.println("Hello world!");
    }
}