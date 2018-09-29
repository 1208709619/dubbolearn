package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProvider {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("classpath:provider.xml");
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
