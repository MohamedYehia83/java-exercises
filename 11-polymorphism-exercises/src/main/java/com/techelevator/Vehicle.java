package com.techelevator;

public abstract class Vehicle  implements IVehicle {
	private double distance;
	private double toll;
	
	public Vehicle(double distance) {
		this.distance = distance;
	}
	
	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getToll() {
		return toll;
	}

	public void setToll(double toll) {
		this.toll = toll;
	}

	
	
	public abstract double calculateToll(double distance);
}
