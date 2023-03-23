package com.shinhan.day05;

public class Circle extends Shape{
	
	double radius;
	double circumference;
	
	public Circle(String color, double radius) {
		super(color, "Circle");
		this.radius=this.radius;
		
	}

	@Override
	public double calculateArea() {
		return radius*radius*Math.PI;
	}

	public String getRadius() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public double calculatePerimeter() {
		circumference = 2*Math.PI*radius;
		return circumference;
	}
	
}
