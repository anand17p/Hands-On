package com.abc12;

public class Rectangle extends Shape  {
	Double length;	
	Double breadth;
	public void computeArea(Double length,Double breadth)
	{
		Double Areaoftherectangle = (length * breadth);
		System.out.println("Area of rectangle is : "+Areaoftherectangle);
	}

}
