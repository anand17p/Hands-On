package com.hcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ApplicationContext context = new AnnotationConfigApplicationContext(OwnerConfig.class);
		Owner e = context.getBean(Owner.class, "e");
		System.out.println("Enter the name , password, mobilenumber of user");
		String name = br.readLine();
		String pwd = br.readLine();
		String mob = br.readLine();
		e.setDetails(name, pwd, mob);
		e.display();
		((AnnotationConfigApplicationContext) context).close();
	}

}
