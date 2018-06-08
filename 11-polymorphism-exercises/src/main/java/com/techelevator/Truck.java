package com.techelevator;

public class Truck extends Vehicle{
	
	private int numberOfAxles;
	
	public int getNumberOfAxles() {
		return numberOfAxles;
	}

	public void setNumberOfAxles(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

	public Truck(double distance,int numberOfAxles) {
		super(distance);
       	this.numberOfAxles = numberOfAxles;
	}

	@Override
	public double calculateToll(double distance) {
		double ratePerMile = 0 ;
		if (numberOfAxles == 4) {
			ratePerMile = 0.040;
		}
		else if (numberOfAxles == 6) {
			ratePerMile = 0.045;
		}
		else if (numberOfAxles >= 8) {
			ratePerMile = 0.048;
		}
		
		this.setToll(ratePerMile * this.getDistance());

		return this.getToll();
	}
	
	@Override
	public String toString() {
		return "Truck";
	}
	
}
