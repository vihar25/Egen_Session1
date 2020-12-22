package com.egen.session1.vihar.carpetcostcalculator;

public class Shape {

	float radius;
	float length;
	float width;
	float costPerSquare;
	float result;
	
	public float area() {
		return result;
	}
	public float cost(float costPerSquare)
	{
		float value =  area() * costPerSquare;
		return value;
		
	}


}
