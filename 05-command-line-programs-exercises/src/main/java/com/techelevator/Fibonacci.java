package com.techelevator;

import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner fibConvert = new Scanner(System.in);
		
		int i;
		long userNum;
		String userLine;
		
		long[] fibSequence = new long[99];
		fibSequence[0] = 0;
		fibSequence[1] = 1;
		for(i = 2; i < fibSequence.length; i++) {
			fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
			
			
		}
		System.out.println("Please enter the number: ");
		userLine = fibConvert.nextLine();
		userNum = Integer.parseInt(userLine);
		System.out.println("The fibanacci sequene leading up to  " + userNum + " is as follows: ");
		
		for ( i = 0; fibSequence[i] <= userNum; i++) {
			System.out.print(fibSequence[i] + " , ");

		}

		
		
		
		
	   
	    

	}

}
