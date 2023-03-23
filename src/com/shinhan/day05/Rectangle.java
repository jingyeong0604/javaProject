package com.shinhan.day05;

public class Rectangle extends Shape{
	int length;
	int width;
	
	public Rectangle(String color, int length, int width) {
		super(color,"Rectangle");
		this.length=length;
		this.width=width;
		
	}
	
	public double calculateArea() {
		return length*width;
	}
	
	public double calculatePerimeter() {
		return 2*(length+width);
	
	}
//	getColor()
//	getType()

}
