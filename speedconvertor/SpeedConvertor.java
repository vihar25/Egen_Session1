package com.egen.session1.vihar.speedconvertor;

public class SpeedConvertor {

	private double milePerHour(double speedInput) {

		if (speedInput <= 0)
			return 0;
		double result = speedInput / 1.609;
		return result;
	}

	public static void main(String args[]) {
		double speedInput = 24.00;
		SpeedConvertor mh = new SpeedConvertor();

		System.out.println(mh.milePerHour(speedInput));
	}

}
