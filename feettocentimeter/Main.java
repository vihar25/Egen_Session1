package com.egen.session1.vihar.feettocentimeter;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		FeetToCentimeter ftc = new FeetToCentimeter();
		double result = 0;
		System.out.println(
				"Choose 1 to convert height from feet and inches to centimeter and choose 2 to convert from inches to centimeter");
		int option = sc.nextInt();
		if (option == 1) {
			System.out.println("Enter your height in feet and inches 😃");
			System.out.println("Feet : ");
			double feet = sc.nextDouble();
			System.out.println("inches : ");
			double inches = sc.nextDouble();
			result = ftc.toCentimeter(feet, inches);
			System.out.println("Your height is " + result + " in inches");
		} else if (option == 2) {
			System.out.println("Enter your height in inches 😃");
			System.out.println("Inches : ");
			double inches = sc.nextDouble();
			result = ftc.toCentimeter(inches);
			System.out.println("Your height is " + result + " in inches");
		} else {
			System.out.println("Invalid input 😔");
		}

	}
}
