package com.abc9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
	    String accName;	
	    String accNo;	
	    String bankName;
	    String tinNumber;
	    String orgName;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose Account Type");
        System.out.println("1.Savings Account");
        System.out.println("2.Current Account");
        int eno=Integer.parseInt(br.readLine());
        switch(eno)
        {
        case 1:
        	System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
            String str=br.readLine();
            String[] details=str.split(",");
            accName=details[0];
            accNo=(details[1]);
            bankName=details[2];
            orgName=details[3];
            SavingsAccount s=new SavingsAccount(accName,accNo,bankName,orgName);
            s.display();
    		System.out.println("Organisation Name:"+orgName);
            break;
        case 2:
        	System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TinNumber)");
            String str1=br.readLine();
            String[] details1=str1.split(",");
            accName=details1[0];
            accNo=(details1[1]);
            bankName=details1[2];
            tinNumber=(details1[3]);
            CurrentAccount c=new CurrentAccount(accName,accNo,bankName,tinNumber);
            c.display();
            System.out.println("TinNumber:"+tinNumber);
            break;
        }
        
	}

}
