package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.context.Theme;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student)context.getBean("student1");
        
        System.out.println("Dependency Injection using setter methods "
        		+ "i.e Setter Depedency Injection\n==================================");
        System.out.println(student);
        
        Car fortuner = (Car) context.getBean("fortuner");
        System.out.println(fortuner);
        
        Car thar = (Car) context.getBean("thar");
        System.out.println(thar);
        
     
    }
}
