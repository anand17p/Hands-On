package com.abc10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		String accountNumber=null;
		Double balance=null;
		String accountHolderName=null;
		Double minimunBalance=null;
		Integer lockingPeriod=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Account details in comma separated");
		String str=br.readLine();
        String[] details=str.split(",");
        accountNumber=details[0];
        balance=Double.parseDouble(details[1]);
        accountHolderName =details[2];
        minimunBalance=Double.parseDouble(details[3]);
        lockingPeriod=Integer.parseInt(details[4]);
        FixedAccount f = new  FixedAccount(accountNumber,balance,accountHolderName,minimunBalance,lockingPeriod);
        f.getAccountDetail();
	}

}
