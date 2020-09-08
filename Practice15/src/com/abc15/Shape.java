package com.abc15;

import java.util.Scanner;


abstract public class Shape {
	Scanner sc=new Scanner(System.in);
	 abstract Double calculatePerimeter();
}
class Circle extends Shape
{
	Double radius;
	Double calculatePerimeter()
	{
		System.out.println("Enter the Radius:");
		radius=sc.nextDouble();
		Double AreaoftheCircle = (22/7) * (radius * radius);
		System.out.println("Area of circle is : "+AreaoftheCircle);
		return AreaoftheCircle;
	}
}
class Rectangle extends Shape {
	Double length;
	Double breadth;
    public Double calculatePerimeter() {
    	System.out.println("Enter the Length and Breath:");
    	length=sc.nextDouble();
    	breadth=sc.nextDouble();
    	Double Areaoftherectangle = (length * breadth);
		System.out.println("Area of rectangle is : "+Areaoftherectangle);
		return Areaoftherectangle;	
	}
}
class Square extends Shape
{
	Double side;
	public Double calculatePerimeter()
	{
		System.out.println("Enter the Side:");
		side=sc.nextDouble();
		Double Areaofthesquare=side*side;
		System.out.println("Area of square is : "+Areaofthesquare);
		return Areaofthesquare;
	}	
}

