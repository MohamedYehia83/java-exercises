package com.techelevator.person;

public class Person {

	


	private String firstName;
	private String lastName;
	private int age;
	
	
public Person() {
	firstName = new String(""); 		// Default first name
	lastName = new String(""); 		// Default last name
	
}

public void DisplayPerson() {		// Note pascal Case for method case
	
	System.out.println("FirstName: " + getFirstName());
	System.out.println("LastName: " + getLastName());
	
}

public String getFullName() {
	return (lastName  + ", " + firstName);
}

public boolean isAdult() {
	
	if(age >= 18) {
		return true;

	}
	return false;
}


public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public void setAge(int age) {
	this.age = age;
}

public String getLastName() {
	return lastName;
}
public int getAge() {
	return age;
}

}
