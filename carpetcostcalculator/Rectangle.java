package com.egen.session1.vihar.carpetcostcalculator;

public class Rectangle extends Shape{
	float result = 0;

	public Rectangle(float length, float width) {
		this.length  = length;
		this.width = width;
		
	}
	public float area() {
		return result  =(float)( length * width);
	}
}
