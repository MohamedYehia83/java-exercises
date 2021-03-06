package com.techelevator;

import java.util.Scanner;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
	    // prompt user for input
	    System.out.println("Please enter the length: ");
	    String length = scanner.nextLine();
	    System.out.println("Is the measurement in (m)eter or (f)eet?");
	    String measurement = scanner.nextLine();
	    
	    //convert input to opposite measurement
	    double intLength = Double.parseDouble(length);
	    String message = "Not a valid type";
	    if(measurement.equals("m")) {
	        message = length + "m is " + (intLength * 3.2808399) + "f";
	    }
	    else if(measurement.equals("f")) {
	        message = length + "f is " + (intLength * 0.3048) + "m";
	    }

	    
	        
	    //display converted input
	    System.out.println(message);
	}

}
