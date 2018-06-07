package com.techelevator.dog;

public class Dog {

	private String dog;
	private String newDogs;
	private boolean isSleeping;
	private String awake;
	
	public Dog() {
		isSleeping = false;
	}
	
	
	public boolean isSleeping() {
		
		return isSleeping;
			}


public String makeSound() {
	if (isSleeping) {
		return "Zzzzz...";
	}
		return "Woof!";
}

public void sleep() {
	isSleeping = true;
}
public void wakeUp() {
	isSleeping = false;
}
}