package org.hcl;


public class Emp {
	String employeeName;
	Integer employeeNumber;
	Double employeeSalary;
	String employeeEmail;
	Address address;
	public Emp() {

	}

	public Emp(String employeeName, Integer employeeNumber, Double employeeSalary, String employeeEmail,
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

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public Double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Double employeeSalary) {
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
		System.out.println("Mobile Number:" + employeeNumber);
		System.out.println("Salary:" + employeeSalary);
		System.out.println("Email:" + employeeEmail);

	}

}
