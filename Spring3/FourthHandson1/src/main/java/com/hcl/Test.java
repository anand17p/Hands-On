package com.hcl;

import java.io.IOException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ApplicationContext context = new AnnotationConfigApplicationContext(CourseConfig.class);
		Course course1 = context.getBean("course1", Course.class);
		Course course2 = context.getBean("course2", Course.class);
		Course course3 = context.getBean("course3", Course.class);
		CourseList courselist = new CourseList();
		courselist.insert(course1);
		courselist.insert(course2);
		courselist.insert(course3);
		courselist.discount();
		((AnnotationConfigApplicationContext) context).close();

	}

}
