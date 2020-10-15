package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User u = context.getBean(User.class, "user");
		u.display();
		Order o = u.getOrder();
		o.display();
		((ClassPathXmlApplicationContext) context).close();

	}

}
