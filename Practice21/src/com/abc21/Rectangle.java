package com.abc21;

public class Rectangle implements Polygon {
	double Length ;
	double Bredth ;

	@Override
	public double calcPeri(double x,double y) {
		double peri=2*(x+y);
		System.out.println("Perimeter of Rectangle : "+peri);
		return 0;
	}

	@Override
	public double calcArea(double x,double y) {
		double area=x*y;
		System.out.println("Area of Rectangle "+area);
		return 0;
	}

}
