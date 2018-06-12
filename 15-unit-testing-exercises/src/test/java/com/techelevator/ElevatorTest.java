package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElevatorTest {

	@Test
	public void testElevator() {
		Elevator myElevator = new Elevator(1,10);
	
//      assertEquals("message if test fails"  ,  expected=result, execute-the-method
		assertEquals("That's not the shaft number",     1     , myElevator.getShaftNumber());
	}
	
	@Test
	public void testTotalNumberOfLevels() {
		Elevator myElevator = new Elevator(1,10);
	
//      assertEquals("message if test fails"      ,       expected=result, execute-the-method
		assertEquals("That's not the total number of floors",     10     , myElevator.getNumberOfLevels());
	
	}
	@Test
	public void testGetCurrentLevel1() {
		
		Elevator myElevator = new Elevator(1,10);
		
		myElevator.GoUp(10);
	
	assertFalse("This is the last floor", false);
}
	
	@Test
	public void testGetCurrentLevel() {
			
			Elevator myElevator = new Elevator(1,10);
			
			myElevator.GoDown(1);
		
		assertFalse("This is the first floor", false);
	}
	
	@Test
	public void testGetOpenDoor() {
			
			Elevator myElevator = new Elevator(1,10);
			
			myElevator.isDoorOpen();
		
		assertFalse("Close the door", false);
	}
	
}