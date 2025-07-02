package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
   public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
	Employees employee = (Employees) context.getBean("employee1");
	System.out.println(employee);
}
}
