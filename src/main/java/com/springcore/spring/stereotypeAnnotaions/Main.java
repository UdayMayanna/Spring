package com.springcore.spring.stereotypeAnnotaions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spring/stereotypeAnnotaions/config.xml");        
		Course c1 = context.getBean(Course.class);
		System.out.println(c1);
    }
}
