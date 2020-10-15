package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(CourseConfig.class);
		Course e=context.getBean("course1",Course.class);
		e.display();
		Course a=context.getBean("course2",Course.class);
		a.display();
		Course b=context.getBean("course3",Course.class);
		b.display();
		((AnnotationConfigApplicationContext)context).close();
	}

}
