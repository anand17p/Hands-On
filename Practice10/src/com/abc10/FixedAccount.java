package com.abc10;

public class FixedAccount extends SavingAccount {
	private Integer lockingPeriod;
	public FixedAccount()
	{
		
	}
	public FixedAccount(String accountNumber, Double balance, String accountHolderName,Double minimunBalance,Integer lockingPeriod) {
		super(accountNumber,balance,accountHolderName,minimunBalance);
		this.lockingPeriod = lockingPeriod;
	}
	public void setLockingPeriod(Integer lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}
	public Integer getLockingPeriod() {
		return lockingPeriod;
	}
	public void getAccountDetail() {
		System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
		System.out.format("%-20s %-10s %-20s %-20s %s\n",getAccountNumber(),getBalance(),getAccountHolderName(),getMinimunBalance(),getLockingPeriod());
	}
}


