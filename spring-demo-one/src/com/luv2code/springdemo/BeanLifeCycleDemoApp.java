package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
	
	// retrieve the bean from spring container
	Coach theCoach = context.getBean("myCoach", Coach.class);
	
	// call methods on the bean
	
	
	// close the context
	context.close();
		
	}

}
