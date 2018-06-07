package com.techelevator;

public class FruitTree {

	private String typeOfFruit;
	private int piecesOfFruitLeft;
	

	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		 this.piecesOfFruitLeft = startingPiecesOfFruit;
	        this.typeOfFruit = typeOfFruit;
	}
	
	
	public boolean pickFruit(int numberOfPiecesToRemove) {
		
		if (piecesOfFruitLeft-numberOfPiecesToRemove >= 0) {
	            piecesOfFruitLeft -= numberOfPiecesToRemove;
	            return true;
	        }
	        else {
	            return false;
	        }
	    }
	/* Notes - pickFruit() is a method - returns true if more fruit was picked or false if no fruit was left 
to be picked. - When picking fruit, update the number of remaining pieces by how many were removed
	
*Constructor

The FruitTree class has a single constructor. It accepts two arguments typeOfFruit and startingPiecesOfFruit.
*/
	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
}
