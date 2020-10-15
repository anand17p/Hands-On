package com.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class CourseConfig {
	@Bean(name = "course1")
	public Course getCourse() {
		Course e = new Course();
		e.setName("Java");
		e.setMentor("Sathish");
		e.setFee(1000);
		return e;
	}

	@Bean(name = "course2")
	public Course getCourse1() {
		Course e = new Course();
		e.setName("Seleinium");
		e.setMentor("Kanimozhi");
		e.setFee(2000);
		return e;
	}
	@Bean(name = "course3")
	public Course getCourse2() {
		Course e = new Course();
		e.setName("Phython");
		e.setMentor("Arun");
		e.setFee(500);
		return e;
	}
}
