package com.abc3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		long over;
	    long ball;
		long runs;
		String batsman;
		String bowler;
		String nonstriker;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the over");
		over = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the ball");
		ball = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the runs");
	    runs = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the batsman name");
		batsman = sc.nextLine();
		System.out.println("Enter the bowler name");
		bowler = sc.nextLine();
		System.out.println("Enter the nonstriker name");
		nonstriker = sc.nextLine();
		Delivery d = new Delivery(over,ball,runs,batsman,bowler,nonstriker);
		Delivery.displayDeliveryDetails(d);

	}

}
