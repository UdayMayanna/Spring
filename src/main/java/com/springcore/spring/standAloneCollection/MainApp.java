package com.springcore.spring.standAloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
     public static void main(String[] args) {
       ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/spring/standAloneCollection/config.xml");
       Student s1 = (Student)context.getBean("student1");
       System.out.println(s1);
     }
}
