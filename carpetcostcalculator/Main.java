package com.egen.session1.vihar.carpetcostcalculator;

public class Main {
	
	public static void main(String args[])
	{
		Shape oval = new Oval(10);
		float price = oval.cost(20);
		System.out.println(price);
		Shape rectangle = new Rectangle(10,20);
		price = rectangle.cost(20);
		System.out.println(price);
	}
}
