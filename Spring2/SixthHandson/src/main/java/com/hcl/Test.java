package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Box b = context.getBean(Box.class, "box");
		User u= b.getUser();
		System.out.println("The hall of length "+b.length+" and width "+b.width+" is owned by "+u.name);

		((ClassPathXmlApplicationContext) context).close();

	}

}
