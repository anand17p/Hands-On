package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(UserConfig.class);
		User e=context.getBean(User.class,"e");
		e.display();
		Order add = e.getOrder();
		add.display();
		((AnnotationConfigApplicationContext)context).close();
	}

}
