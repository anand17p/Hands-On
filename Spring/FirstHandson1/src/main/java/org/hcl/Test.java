package org.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(EmpConfig.class);
		Emp e=context.getBean(Emp.class,"e");
		e.display1();
		Address add = e.getAddress();
		add.display2();
		((AnnotationConfigApplicationContext)context).close();
	}

}
