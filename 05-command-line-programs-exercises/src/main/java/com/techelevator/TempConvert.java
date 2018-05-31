package com.techelevator;

import java.util.Scanner;

/*
 The Fahrenheit to Celsius conversion formula is:
 	Tc = (Tf - 32) / 1.8
 	where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit
 	
 The Celsius to Fahrenheit conversion formula is:
 	Tf = Tc * 1.8 + 32
 	
 Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit.
 Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
  
 $ java TempConvert
 Please enter the temperature: 58
 Is the temperature in (C)elcius, or (F)arenheit? F
 58F is 14C.
 
 Note why Tf - 32 above is enclosed in parentheses with a comment inside your code. You'll feel better for it, 
 and will start building some good programming habits while you're at it.
 */
public class TempConvert {

	


	public static void main(String[] args) {

		Scanner tempConverter = new Scanner(System.in);
		

		 System.out.println("Please inter the temperature: ");   // prompt the user	
		 String measure = tempConverter.nextLine();              // get the temp as a String        
		 double convertedNumber = Double.parseDouble(measure);        // convert temp from String to a number

		
		System.out.println("Is the temperature in (C)elcius or (F)arenheit?");
	     String measurement = tempConverter.nextLine(); 
	    
	    System.out.println("Thanks for the input");	

	    double result1 ; // hold Celsius result   
	    double result2 ;  //  hold Fahrenheit result

	    if(measurement.equals("F") || measurement.equals("f")) {
	        result1 =  (convertedNumber - 32) / 1.8;
	        
		      System.out.println(measure + "f is " +result1 + "c");  
	    

	    } else if (measurement.equals("C") || measurement.equals("c")) {
			        result2 = (convertedNumber * 1.8 + 32);
			        
				      System.out.println(measure + "c is " +result2 + "f");  

	        	      
	   
	
	    }else {
		      System.out.println("Not a valid temperature value ");  

	    }
	    
	}
}        
