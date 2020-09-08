package com.abc13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		String detail;
	    String ownerName;
	    Integer noOfStall;
	    Integer noOfShows;
		Integer noOfSeatsPerShow;
		Scanner sc=new Scanner(System.in);
		Event e1=new Event();
		System.out.println("Enter the name of the event:");
		name = sc.nextLine();
		System.out.println("Enter the detail of the event:");
		detail = sc.nextLine();
		System.out.println("Enter the owner name of the event:");
		ownerName= sc.nextLine();
		System.out.println("Enter the type of the event:");
		System.out.println("1.Exhibition");
		System.out.println("2.StageEvent");
		int no=sc.nextInt();
		switch(no) {
		case 1:
			System.out.println("Enter the number of stalls:");
			noOfStall=sc.nextInt();
			Exhibition e=new Exhibition();
			e.projectedRevenue(noOfStall);
		    
			break;
		case 2:
			System.out.println("Enter the number of shows:");
			noOfShows =sc.nextInt();
		    System.out.println("Enter the number of seats per show:");
		    noOfSeatsPerShow=sc.nextInt();
		    StageEvent s=new StageEvent();
		    s.projectedRevenue(noOfShows, noOfSeatsPerShow);
			break;
	}

}
}
