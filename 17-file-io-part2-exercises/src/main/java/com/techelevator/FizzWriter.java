package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter printtoFile = new PrintWriter("FizzBuzz.txt");
			for (int i = 1; i <301; i++) 
			{
				if (i % 3 == 0 && i % 5 == 0) {
					
		            printtoFile.println("FizzBuzz");	
			  
				} else if (i % 3 == 0 ||Integer.toString(i).equals("3")) {
					
					printtoFile.println("Fizz");	
		

			    } else if (i % 5 == 0 || Integer.toString(i).equals("5")) {
				    
			    		printtoFile.println("Buzz");	

			    }else
			    
			    		printtoFile.println(i);
			}
			printtoFile.close();
	}	  
}
