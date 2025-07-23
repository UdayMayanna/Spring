package com.springcore.spring.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.spring.autowiring.Employee;
import com.springcore.spring.autowiring.Student;

public class MainApp {

	public static void main(String[] args) {
 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spring/autowiring/annotation/springAnnotationConfig.xml");
        Student student = context.getBean("student",Student.class);
        System.out.println(student);
	}

}
