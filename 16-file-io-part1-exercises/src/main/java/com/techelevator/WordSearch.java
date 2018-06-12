package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the word that you want to search: ");
		String word = input.nextLine();
		System.out.println("Does it has to be case sensitive? y/n: ");
		String isSensitive = input.nextLine();
		int counterLine = 0;

		try {
			BufferedReader reader = new BufferedReader(new FileReader("test_quiz.txt"));
	
			while (true) {
				String line = reader.readLine();

				if (line == null) {
					break;
					}
				
				if (isSensitive.equals("y")) {
					if(line.contains(word)) {
						System.out.println(counterLine + ") " + line );
					}
				}
				else { // is not sensitive
					if(line.toLowerCase().contains(word.toLowerCase())) {
						System.out.println(counterLine + ") " + line);
					}
					
				}
				counterLine++;
			}
			reader.close();

		} catch (Exception e) {

		}

	}

	
}
