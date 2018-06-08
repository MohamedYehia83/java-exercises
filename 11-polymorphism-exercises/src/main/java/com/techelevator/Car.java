package com.techelevator;

public class Car extends Vehicle{
	private boolean trailer;
	
	public Car(double distance, boolean trailer) {
		super(distance);
		this.trailer = trailer;
	}
	

	public boolean isTrailer() {
		return trailer;
	}


	public void setTrailer(boolean trailer) {
		this.trailer = trailer;
	}


	@Override
	public double calculateToll(double distance) {
		this.setToll(this.getDistance() * 0.020);
		if (isTrailer()) {
			this.setToll(this.getToll() + 1.00);
		}

		return this.getToll();
	}
	
	@Override
	public String toString() {
		return "Car";
	}


	
	
}