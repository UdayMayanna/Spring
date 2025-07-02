package com.springcore.referenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
           ApplicationContext context  = new ClassPathXmlApplicationContext("com/springcore/referenceInjection/referenceInjectionconfig.xml");
           Employee employee=(Employee) context.getBean("Employee1");
           System.out.println(employee);
	}

}
