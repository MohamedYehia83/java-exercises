package com.techelevator.company;

public class Company {

	private String name;
	private int numberOfEmployees;
	private double revenue;
	private double expenses;
	
	public Company() {
		name = new String("");
		numberOfEmployees = 0;
		revenue = 0.0;
		expenses = 0.0;
}
	
	public void DisplayCompany() {
		
		System.out.println("name: " + getName());
		System.out.println("NumberOfEmployees: " + getNumberOfEmployees());
		System.out.println("revenue: " + getRevenue());
		System.out.println("expenses: " + getExpenses());
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	
	public String getCompanySize() {
		if (numberOfEmployees <= 50) {
			return ("small");
		}
		else if 
			(numberOfEmployees >= 51 && numberOfEmployees <= 250) {
			
			return ("medium");
		}     
			return ("large");
	}

	public double getProfit() {
		return (revenue - expenses);
	}
	
	
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public double getExpenses() {
		return expenses;
	}

	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}

	
	
	
}
