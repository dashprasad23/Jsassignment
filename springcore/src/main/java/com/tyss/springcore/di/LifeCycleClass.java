package com.tyss.springcore.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Hellow hellow=context.getBean(Hellow.class);
		System.out.println(hellow.getMessage());
		context.close();
	}

}
