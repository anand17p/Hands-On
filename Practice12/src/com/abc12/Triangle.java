package com.abc12;

public class Triangle extends Shape  {
	Double base;
	Double height;
	public void computeArea(Double base,Double height)
	{
	   Double Areaofthetriangle = (base * height)/2;
	   System.out.println("Area of triangle is : "+Areaofthetriangle);
	}
}
