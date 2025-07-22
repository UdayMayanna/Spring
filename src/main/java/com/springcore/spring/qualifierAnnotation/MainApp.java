package com.springcore.spring.qualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spring/qualifierAnnotation/config.xml");
    Student s1 = context.getBean("student1",Student.class);
    System.out.println(s1);   
    }
}
