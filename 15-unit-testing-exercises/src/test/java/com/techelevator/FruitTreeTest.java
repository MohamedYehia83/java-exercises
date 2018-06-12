package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FruitTreeTest {

	
		@Test
		public void testReturnTypeOfFruit() {
			
		  FruitTree myFruitTree = new FruitTree("apple",10);
//	      assertEquals("message if test fails"      ,  expected=result, execute-the-method
		  assertEquals("That's not the right fruit",     "apple"     , myFruitTree.getTypeOfFruit());
		}
		
		@Test
		public void testReturnPiecesOfFruitLeft() {
			
		  FruitTree myFruitTree = new FruitTree("apple",10);
//	      assertEquals("message if test fails"      ,  expected=result, execute-the-method
		  assertEquals("That's not the right number of starting pieces of fruit",     10     , myFruitTree.getPiecesOfFruitLeft());
		}
		
		@Test
		public void testGetNumberOfPieces() {
				
		  FruitTree myFruitTree = new FruitTree("apple",10);
		  myFruitTree.PickFruit(5);
		  assertTrue("There isn't enough pieces of fruit left", myFruitTree.getPiecesOfFruitLeft()==5);
		}
}


