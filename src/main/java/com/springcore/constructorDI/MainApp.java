package com.springcore.constructorDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	  ApplicationContext context  = new ClassPathXmlApplicationContext("com/springcore/constructorDI/configConstructorDI.xml");	  
	  Store store = (Store) context.getBean("store1");
	  System.out.println(store);
	}

}
