package com.egen.session1.vihar.carpetcostcalculator;

public class Oval extends Shape {

	float result = 0;

	public Oval(float radius) {
		this.radius  = radius;
		
	}
	public float area() {
		return result  = (float) (3.14 * radius * radius);
	}
	
	

}
