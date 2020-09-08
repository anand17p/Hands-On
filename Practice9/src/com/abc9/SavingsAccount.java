package com.abc9;

public class SavingsAccount extends Account  {
	private String orgName;
	public SavingsAccount()
	{
		
	}
	public SavingsAccount(String accName, String accNo, String bankName,String orgName) {
		super(accName,accNo,bankName);
		this.orgName = orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgName() {
		return orgName;
	}
	
	
}
