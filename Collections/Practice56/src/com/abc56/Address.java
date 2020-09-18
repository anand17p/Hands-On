package com.abc56;

public class Address implements Comparable<Address>{
	String username	;
	String addressLine1;
	String addressLine2;
	Integer pinCode	;
	public Address()
	{
		
	}
	public Address(String username, String addressLine1, String addressLine2, Integer pinCode) {
		super();
		this.username = username;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pinCode = pinCode;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	public String getUsername() {
		return username;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	@Override
	public int compareTo(Address e) {
		if(this.pinCode==e.pinCode)
		return 0;
		else if(this.pinCode>e.pinCode)
		return 1;
		else
			return -1;
	}
	

}
