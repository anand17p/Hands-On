package com.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
	@Bean(name = "e")
	public User getEmp() {
		User e = new User();
		e.setName("Jegan");
		e.setAge(24);
		e.setCity("Chennai");
		e.setOrder(getOrder());
		return e;
	}

	@Bean
	public Order getOrder() {
		Order a = new Order();
		a.setItemName("item1");
		a.setPrice(230.7);
		return a;
	}
}
