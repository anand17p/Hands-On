package com.abc10;

public class SavingAccount extends Account  {
	protected Double minimunBalance;
	
	public SavingAccount()
	{
		
	}
	public SavingAccount(String accountNumber, Double balance, String accountHolderName,Double minimunBalance) {
		super(accountNumber,balance,accountHolderName);
		this.minimunBalance = minimunBalance;
	}

	public void setMinimunBalance(Double minimunBalance) {
		this.minimunBalance = minimunBalance;
	}

	public Double getMinimunBalance() {
		return minimunBalance;
	}	
	

}
