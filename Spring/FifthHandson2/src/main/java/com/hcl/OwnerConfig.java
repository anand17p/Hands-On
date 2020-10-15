package com.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OwnerConfig {
	@Bean(name = "e")
	public Owner getEmp() {
		Owner e = new Owner();
		return e;
	}

}
