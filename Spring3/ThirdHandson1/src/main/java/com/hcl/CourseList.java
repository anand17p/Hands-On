package com.hcl;

import java.util.ArrayList;

public class CourseList {
	private ArrayList<Course> courseList = new ArrayList<Course>();

	public void insert(Course course) {
		courseList.add(course);
	}

	public void rvenue() {
		double total = 0;

		for (Course course : courseList) {

			total += 200 * course.getFee();

		}
		System.out.println("Total Revenue:" + total * 0.2);
	}

}
