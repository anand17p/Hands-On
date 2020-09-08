package com.abc15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				Shape s=new Circle();
				Shape s1=new Rectangle();
				Shape s2=new Square();
				System.out.println("List of Shapes:");
		        System.out.println("1.Circle\r\n" + 
				"2.Rectangle\r\n" + 
				"3.Square\r\n" + 
				"");
		        System.out.println("Enter your choice:");
		        int no=sc.nextInt();
		        switch(no) {
				case 1:
					s.calculatePerimeter();
					break;
				case 2:
					s1.calculatePerimeter();
					break;
			    case 3:
				    s2.calculatePerimeter();
				    break;
		        }
	}

}
