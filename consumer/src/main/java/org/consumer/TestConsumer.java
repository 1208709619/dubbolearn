package org.consumer;

import com.test.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConsumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("classpath:consumer.xml");


        IUserService userService = (IUserService) context.getBean("userService");
        System.out.println(userService.sayHello("xiaoming"));

    }
}
