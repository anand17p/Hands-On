package com.abc12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Double radius;
		Double length;	
		Double breadth;
		Double base;
		Double height;
		Scanner sc=new Scanner(System.in);
		Shape s=new Shape();
		Circle s1=new Circle();
		Rectangle s2=new Rectangle() ;
		Triangle s3=new Triangle();
		System.out.println("Enter the Shape");
		System.out.println("1.Circle\r\n" + 
				"2.Rectangle\r\n" + 
				"3.Triangle\r\n" + 
				"");
		int no=sc.nextInt();
		switch(no) {
		case 1:
			System.out.println("Enter the radius:");
		    radius=sc.nextDouble();
		    s1.computeArea(radius);
			break;
		case 2:
			System.out.println("Enter the length and breadth:");
			length=sc.nextDouble();
			breadth=sc.nextDouble();
		    s2.computeArea(length,breadth);
			break;
		case 3:
			System.out.println("Enter the base and height:");
			base=sc.nextDouble();
			height=sc.nextDouble();
		    s3.computeArea(base,height);
			break;
			
		}
		
	}

}
