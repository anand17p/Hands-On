package com.abc19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you want to invest");
        int no=sc.nextInt();
        System.out.println("Enter the tenure of the SIP");
        int no1=sc.nextInt();
        AxisBank m=new AxisBank();
        HDFC m1=new HDFC();
        ICICI m2=new ICICI();
        System.out.println("What you want to ");
		System.out.println("1)AxisBank\r\n" + 
				"2)HDFC\r\n" + 
				"3)ICICI\r\n" + 
				"");
		int no3=sc.nextInt();
		switch(no3) {
		case 1:
		     m.amount(no,no1); 
			break;
		case 2:
			 m1.amount(no,no1); 
			break;
		case 3:
			 m2.amount(no,no1); 
			break;     
	}
	}

}
