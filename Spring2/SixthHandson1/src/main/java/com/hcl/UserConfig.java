package com.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
	@Bean(name = "e")
	public Box getEmp() {
		Box e = new Box();
		e.setLength(10);
		e.setWidth(12);
		e.setUser(getUser());
		return e;
	}

	@Bean
	public User getUser() {
		User a=new User();
		a.setName("Surya");
		a.setPassword("surya");
		return a;
	}
}
