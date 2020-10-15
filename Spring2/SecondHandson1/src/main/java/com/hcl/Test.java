package com.hcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArrayList<String> noofCourses = null;
		Course course1 = context.getBean("course1", Course.class);
		Course course2 = context.getBean("course2", Course.class);
		Course course3 = context.getBean("course3", Course.class);
		CourseList courselist = new CourseList();
		System.out.println("Enter your Budget");
		double budget = Double.parseDouble(br.readLine());
		courselist.insert(course1);
		courselist.insert(course2);
		courselist.insert(course3);

		noofCourses = courselist.noOfCourse(budget);
		if (noofCourses.isEmpty()) {
			System.out.println("No Course available");
		} else {
			for (String courses : noofCourses) {
				System.out.println(courses);
			}
		}
		((ClassPathXmlApplicationContext) context).close();

	}

}
