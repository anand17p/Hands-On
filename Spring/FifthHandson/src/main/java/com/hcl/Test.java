package com.hcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Owner e=context.getBean(Owner.class,"own");
		System.out.println("Enter the name , password, mobilenumber of user");
	    String name = br.readLine();
	    String pwd = br.readLine();
	    String mob = br.readLine();
		e.setDetails(name,pwd,mob);
		e.display();
		((ClassPathXmlApplicationContext) context).close();
	
	}

}
