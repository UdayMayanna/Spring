package com.springcore.springlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	AbstractApplicationContext context	= new ClassPathXmlApplicationContext("com/springcore/springlifecycle/springlifecycleconfig.xml");
	context.registerShutdownHook();
	
	Laptop l1 =(Laptop) context.getBean("laptop1");
	System.out.println(l1);
	
	Mobile m1 = (Mobile) context.getBean("mobile1");
	System.out.println(m1);
	
	Bottle b1 = (Bottle) context.getBean("bottle1");
	System.out.println(b1);
	// To work with destroy lifecycle method I have to call registerShutDownHook method 
	// which is not available inside ApplicationContext interface 
	// Hence I have used AbstractApplicationContext which provides registerShutdownHook method
	}

}
