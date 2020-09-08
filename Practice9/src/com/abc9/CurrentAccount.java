package com.abc9;

public class CurrentAccount extends Account {
	private String tinNumber;
	public CurrentAccount() {
		
	}
	public CurrentAccount(String accName, String accNo, String bankName,String tinNumber) {
		super(accName,accNo,bankName);
		this.tinNumber = tinNumber;	
	}
	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}
	public String getTinNumber() {
		return tinNumber;
	}
	
	
}
