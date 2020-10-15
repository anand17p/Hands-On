package org.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
	@Bean(name = "e")
	public Emp getEmp() {
		Emp e=new Emp();
		e.setEmployeeName("Sathish");
		e.setEmployeeNumber(956625995);
		e.setEmployeeSalary(45000.0);
		e.setEmployeeEmail("me@gmail.com");
		e.setAddress(getAddress());
		return e;
	}
	@Bean
	public Address getAddress() {
		Address a=new Address();
		a.setLine1("2/115 Anna Nagar");
		a.setLine2("Kaveripattinum");
		a.setCity("Krishnakiri");
		a.setPincode("635112");
		return a;
	}
}
