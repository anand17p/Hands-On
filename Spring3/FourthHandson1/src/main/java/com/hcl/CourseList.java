package com.hcl;

import java.util.ArrayList;
import java.util.Collections;

public class CourseList {
	private ArrayList<Course> courseList = new ArrayList<Course>();

	public void insert(Course course) {
		courseList.add(course);
	}

	public void discount() {
		ArrayList<Double> courses = new ArrayList<Double>();

		for (Course course : courseList) {
			double fees = (double) course.getFee();
			courses.add(fees);
		}
		double coursefee1 = Collections.max(courses);
		double discount1 = (0.1) * coursefee1;
		double coursefee2 = Collections.min(courses);
		double discount2 = (0.1) * coursefee2;
		System.out.println("Maximum Discount " + discount1 + " is available");

		System.out.println("Minimum Discount " + discount2 + " is available");
	}
}
