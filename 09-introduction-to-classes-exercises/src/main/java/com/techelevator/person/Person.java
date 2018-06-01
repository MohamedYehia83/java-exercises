package com.techelevator.person;

public class Person {

	


	private String firstName;
	private String lastName;
	private int age;
	private boolean isAdult;
	private String getFullName = lastName + firstName;
	
	
public Person() {
	firstName = new String(""); 		// Default first name
	lastName = new String(""); 		// Default last name
	isAdult = true;     				// Default is adult						
	getFullName = new String(""); 		// Default get full name
}

public void DisplayPerson() {		// Note pascal Case for method case
	
	System.out.println("FirstName: " + getFirstName());
	System.out.println("LastName: " + getLastName());
	System.out.println("isAdult: " + isAdult());
	System.out.println("getFullName: " + getGetFullName());
}

public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public Integer getAge() {
	return age;
}
public boolean isAdult() {
	return isAdult;
}
public String getGetFullName() {
	return getFullName;
}	
   if isAdult == true; {
		
	}
	return isAdult;
	
}

System.out.println(lastName + ", " + firstName);
}
