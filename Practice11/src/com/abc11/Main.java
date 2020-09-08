package com.abc11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;	
		String detail;	
	    String ownerName;
	    Integer squareFeet;
		Integer numberOfTV;
		Stall s=new Stall();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the stall:");
		name=sc.nextLine();
		System.out.println("Enter the detail of the stall:");
		detail=sc.nextLine();
		System.out.println("Enter the  Ownwr name:");
		ownerName=sc.nextLine();
		System.out.println("1.Platinum\r\n" + 
				"2.Diamond\r\n" + 
				"3.Gold\r\n" + 
				"");
		int stallType=sc.nextInt();
		System.out.println("Enter the size of the stall in square feet:");
		squareFeet=sc.nextInt();
		System.out.println("Does the hall have TV?(1.y/2.n)");
		int c=sc.nextInt();
		if(c==1)
		{
		System.out.println("Enter the number of TV:");
		numberOfTV=sc.nextInt();
		s.computeCost(stallType, squareFeet, numberOfTV);
		}
		else
		{
			s.computeCost(stallType, squareFeet);
		}
		
	}

}
