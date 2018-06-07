package com.techelevator.product;

public class Product {

	private String name;
	private double price;
	private double weightInOunces;
	
	public Product() {
		name = new String("");
		price = 0.00;
		weightInOunces = 0.00;
	}
	
public void DisplayProduct() {
		
		System.out.println("name: " + getName());
		System.out.println("price: " + getPrice());
		System.out.println("weightInOunces: " + getWeightInOunces());
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeightInOunces() {
		return weightInOunces;
	}
	public void setWeightInOunces(double weightInOunces) {
		this.weightInOunces = weightInOunces;
	}
	
}
