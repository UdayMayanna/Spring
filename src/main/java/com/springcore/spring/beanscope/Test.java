package com.springcore.spring.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        // By default scope of bean is singlton
        // we can declare scope of bean from XML inside bean tag
        // and with the help of annotation on the class
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spring/beanscope/config.xml");
        Singleton singleton = context.getBean("singleton",Singleton.class);
        Singleton singleton1 = context.getBean("singleton",Singleton.class);
        System.out.println("for singleton scope\n"+singleton.hashCode()+"\n"+singleton1.hashCode()+"\n\nfor prototype scope");
        
        Prototype prototype = context.getBean("prototype",Prototype.class);
        Prototype prototype1 = context.getBean("prototype",Prototype.class);
        System.out.println(prototype.hashCode()+"\n"+prototype1.hashCode());
    }
}
