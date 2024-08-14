package com.neotech.lesson26;

public interface Shape {
	double calculateArea();
	double calculatePerimeter();

}
class Circle implements Shape{
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public  double  calculateArea() {
		// TODO Auto-generated method stub
		double result = Math.PI*(radius*radius);
		return result;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		double result = 2*(Math.PI*radius);
		return result;
	}
	
}