package com.abc12;

public class Circle extends Shape {
	Double radius;
	public void computeArea(Double radius)
	{
		Double AreaoftheCircle = (22/7) * (radius * radius);
		System.out.println("Area of circle is : "+AreaoftheCircle);
	}
}
