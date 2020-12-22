package com.egen.session1.vihar.feettocentimeter;

import java.util.Scanner;

public class FeetToCentimeter {
	

	public double toCentimeter(double feet, double inches) {
		double centimeter = (feet * 30.48) + (inches * 2.54);
		return centimeter;
	}

	public double toCentimeter(double inches) {
		double centimeter = inches * 2.54;
		return centimeter;
	}



}
