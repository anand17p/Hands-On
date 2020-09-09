package com.abc21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Polygon p=new Square();
		Polygon p1=new Rectangle();
		System.out.println("Enter Breadth & Length Of Square :");
		double no=sc.nextDouble();
		double no1=sc.nextDouble();
		System.out.println("Enter Side Value :");
		double no2=sc.nextDouble();
		p1.calcPeri(no,no1);
		p1.calcArea(no,no1);
		p.calcPeri(no2, 0);
		p.calcArea(no2, 0);
	}

}
