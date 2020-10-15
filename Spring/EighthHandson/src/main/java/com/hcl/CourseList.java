package com.hcl;

import java.util.ArrayList;

public class CourseList {
	private ArrayList<Course> courseList = new ArrayList<Course>();

	public void insert(Course course) {
		courseList.add(course);
	}

	public void discount() {
		for (Course course : courseList) {
			System.out.println("Course: "+course.getName()+"\n"+"SME by: "+course.getMentor()+"\n"+"Fees: "+course.getFee());
		}
		
	}
	

}
