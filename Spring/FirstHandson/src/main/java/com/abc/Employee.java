package com.abc;

import java.util.ArrayList;

public class Employee {
	String employeeName;
	ArrayList<String> employeeNumber;
	Long employeeSalary;
	String employeeEmail;
	Address address;

	public Employee() {

	}

	public Employee(String employeeName, ArrayList<String> employeeNumber, Long employeeSalary, String employeeEmail,
			Address address) {
		super();
		this.employeeName = employeeName;
		this.employeeNumber = employeeNumber;
		this.employeeSalary = employeeSalary;
		this.employeeEmail = employeeEmail;
		this.address = address;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public ArrayList<String> getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(ArrayList<String> employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public Long getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display1() {
		System.out.println("Name:" + employeeName);
		System.out.println("The Contact numbers are:");
		for(String mob:employeeNumber)
		{
			System.out.println(mob );	
		}
		System.out.println("Salary:" + employeeSalary);
		System.out.println("Email:" + employeeEmail);

	}

}
