package com.techelevator;

public class Week1Evaluation {

	public static void main(String[] args) {
		
		/*
		  These statement will test the code you write in the processScores method below.
		  Please do not modify any code within the main method.
		*/
		int [] janeScores  = {100, 80, 75};
		int [] frankScores = {  0, 65, 70};
		int [] jackScores  = { 70, 90, 60};
		int [] maryScores  = {100, 93, 95};
		int [] daveScores  = { 69, 65, 60};
		
		
		processScores(janeScores);
		processScores(frankScores);
		processScores(jackScores);
		processScores(maryScores);
		processScores(daveScores);		
	}
			
	public static void processScores(int [] testScores) {
		
		// TODO write all your exercise code here
		
		int sumOfNum = 0;
		int testScore = 0;
		
		for(int i = 0; i < testScores.length; i++) {
			testScore = testScores[i];
			
			System.out.println("Test Score: " + testScore);
			
		}
		
		for(int i = 0; i < testScores.length; i++) {
			sumOfNum += testScores[i];
		}
		
		System.out.println("Sum of test score: " + sumOfNum);
		double avgScores = sumOfNum / 3;
		
		if(avgScores < 60) {
			System.out.println("Letter Grade: " + "F"); 
		}
		else if(avgScores >= 60 && avgScores <= 69) {
			System.out.println("Letter Grade: " + "D"); 
		}
		else if(avgScores >= 70 && avgScores <= 79) {
			System.out.println("Letter Grade: " + "C"); 
		}
		else if(avgScores >= 80 && avgScores <= 89) {
			System.out.println("Letter Grade: " + "B"); 
		}else {
			System.out.println("Letter Grade: " + "A");
		}
		
		System.out.println("Avg of test scores: " + avgScores);
		
		
	}

}

