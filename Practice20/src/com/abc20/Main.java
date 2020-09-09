package com.abc20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Fort f=new Rajmachi();
		Fort f1=new Shivgadh();
		Fort f2=new Murud();
		System.out.println("What you want to visit");
		System.out.println("1)Rajmachi\r\n" + 
				"2)Shivgadh\r\n" + 
				"3)Murud\r\n" + 
				"");
		int no=sc.nextInt();
		switch(no) {
		case 1:
			f.distance();
			break;
		case 2:
			f1.distance();
			break;
		case 3:
			f2.distance();
			break;
		}
		

	}

}
