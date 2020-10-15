package com.hcl;

public class Owner {
	String name;
	String password;
	String mobileNumber;

	public void setDetails(String name, String password, String mobileNumber) {
		this.name = name;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}

	public void display() {
		System.out.println("Name : " + name + "\n" + "Mobile Number : " + mobileNumber);
	}

}
