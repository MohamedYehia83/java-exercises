package com.techelevator;

import java.util.Scanner;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {
		int workingValue;
		String binaryValue = "";
		int inputDecimal;
		String tempString;
		
		Scanner keyboard = new Scanner(System.in);
	    System.out.println("Enter a decimal value: ");
	    
	    String userInput = keyboard.nextLine();
	    inputDecimal = Integer.parseInt(userInput);
	    
	    for(workingValue = inputDecimal ;workingValue > 0; workingValue = workingValue / 2)
	    {
	    tempString = String.valueOf(workingValue % 2);
	    binaryValue = tempString + binaryValue;
	    }
	    		System.out.println(inputDecimal + "in binary is " + binaryValue);
	    
	}

}



