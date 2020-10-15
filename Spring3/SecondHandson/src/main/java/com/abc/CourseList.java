package com.abc;

import java.util.ArrayList;

public class CourseList {
	private ArrayList<Course> courseList = new ArrayList<Course>();

	public void insert(Course course) {
		courseList.add(course);
	}

	public ArrayList<String> noOfCourse(Double fee) {
		ArrayList<String> courses = new ArrayList<String>();

		for (Course course : courseList) {
			if (fee >= course.getFee()) {
				int fees = (int) (fee / course.getFee());
				String validatingsentence = course.getName() + "-" + fees;
				courses.add(validatingsentence);
			}
		}
		return courses;

	}

}
