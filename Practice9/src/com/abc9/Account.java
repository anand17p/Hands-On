package com.abc9;

public class Account {
	protected String accName;	
	protected String accNo;	
	protected String bankName;
	public Account()
	{
		
	}
	public Account(String accName, String accNo, String bankName) {
		super();
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
		
		
	}
	protected void display()
	{
		System.out.println("Account Name: "+getAccName());
		System.out.println("Account Number:"+getAccNo());
		System.out.println("Bank Name:"+getBankName());
	}
	
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccName() {
		return accName;
	}
	public String getAccNo() {
		return accNo;
	}
	public String getBankName() {
		return bankName;
	}
	
	

}
