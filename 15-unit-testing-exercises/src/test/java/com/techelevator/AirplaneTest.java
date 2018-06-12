package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class AirplaneTest {

	//Airplane myAirPlane = new Airplane(10, 50);
	
	@Test
	public void testReturnPlaneNumber() {
		
		Airplane myAirPlane = new Airplane("46",10, 50);
		
//      assertEquals("message if test fails"      ,  expected=result, execute-the-method
		assertEquals("That's not the plane number",     "46"     , myAirPlane.getPlaneNumber());
	}

	@Test
	public void testTotalFirstClassSeats() {
		Airplane myAirPlane = new Airplane("46",10, 50);
		
		assertEquals("No First Class Seats are available", 10 , myAirPlane.getTotalFirstClassSeats());
	}
	
	
	
	@Test
	public void testTotalCoachSeats() {
		Airplane myAirPlane = new Airplane("46",10, 50);
		assertEquals("No coach seats are available", 50 , myAirPlane.getTotalCoachSeats());
}
}