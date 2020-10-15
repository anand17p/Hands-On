package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = context.getBean(Employee.class, "employee");
		emp.display1();
		Address add = emp.getAddress();
		add.display2();
		((ClassPathXmlApplicationContext) context).close();

	}

}
