package com.springcore.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spring/autowiring/springAnnotationConfig.xml");
        Employee employee = context.getBean("employee1",Employee.class);
        System.out.println(employee);
        
        Student student = context.getBean("student",Student.class);
        System.out.println(student);
	}

}
