package com.abc21;

public class Square implements Polygon {
	double side;

	@Override
	public double calcPeri(double x,double y) {
		double peri=4*x;
		System.out.println("Perimeter of Square : "+peri);
		return 0;
	}

	@Override
	public double calcArea(double x,double y) {
		double area=x*x;
		System.out.println("Area of Square : "+area);
		return 0;
	}

}
