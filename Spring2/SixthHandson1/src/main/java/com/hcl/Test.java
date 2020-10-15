package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
		Box e = context.getBean(Box.class, "e");
		User u = e.getUser();
		System.out.println("The hall of length " + e.length + " and width " + e.width + " is owned by " + u.name);
		((AnnotationConfigApplicationContext) context).close();
	}

}
