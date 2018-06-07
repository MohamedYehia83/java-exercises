package com.techelevator.calculator;

public class Calculator {

	
	private int currentValue;

	public Calculator() {
	setCurrentValue(0);
	}

	public int add(int addend) {
	return currentValue = (currentValue + addend);
	}

	public int multiply(int multiplier) {
	return currentValue = (currentValue * multiplier);
	}

	public int subtract(int subtrahend) {
	return currentValue = (currentValue - subtrahend);
	}

	public int power(int exponent) {
	int startingInt = currentValue;
	for (int i = 0; i <= exponent; i++) {
	currentValue = startingInt * startingInt;
	}
	return currentValue;
	}

	public void reset() {
	currentValue = 0;
	}

	public int getCurrentValue() {
	return currentValue;
	}

	public void setCurrentValue(int currentValue) {
	this.currentValue = currentValue;
	}
	
}
