package com.techelevator;

public class Tank extends Vehicle {


	public Tank(double distance) {
		super(distance);
	}

	

	@Override
	public double calculateToll(double distance) {
		return 0;

	}
	
	@Override
	public String toString() {
		return "Tank";
	}
}
