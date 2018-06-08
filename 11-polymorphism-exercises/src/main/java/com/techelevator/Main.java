package com.techelevator;

import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		vehicles.add(new Car(100, false));
		vehicles.add(new Car(75, true));
		vehicles.add(new Tank(240));
		vehicles.add(new Truck(150, 6));
		
		System.out.println("Vehicle          Distance Traveled      Toll $");
		System.out.println("----------------------------------------------");
		
		for (Vehicle vehicle : vehicles) {
			System.out.print(vehicle.toString() + '\t' + '\t');
			System.out.print((int)vehicle.getDistance() + "\t " + "\t" + "\t" + "$");
			System.out.printf("%.2f", vehicle.calculateToll(vehicle.getDistance()));
			System.out.println();
			
		}
	}

}
