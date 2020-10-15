package com.hcl;

public class User {
	String name;
	Integer age;
	String city;
	Order order;

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	public void display() {
		
		System.out.println("Name: "+ name+ "\n" +"Age: "+ age + "\n" +"City: "+ city );
	}

}
