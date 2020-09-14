package com.abc42;

public class Address {
	private Integer userId	;
	private String street;
	private String city;
	private String state;
	public Address(Integer userId, String street, String city, String state) {
		super();
		this.userId = userId;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getUserId() {
		return userId;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}


}
