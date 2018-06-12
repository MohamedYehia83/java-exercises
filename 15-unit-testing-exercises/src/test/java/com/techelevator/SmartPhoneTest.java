package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SmartPhoneTest {

	@Test
	public void testGetphoneNumber() {
			
		SmartPhone mySmartPhone = new SmartPhone("419-779-3203","TMobile");
		
	  assertEquals("Call failed","419-779-3203",mySmartPhone.getPhoneNumber());
	}
	
	@Test
	public void testGetCarrier() {
			
		SmartPhone mySmartPhone = new SmartPhone("419-779-3203","TMobile");
		
	  assertEquals("Wrong carrier", "TMobile", mySmartPhone.getCarrier());
	}
	@Test
	public void testisOnCall() {
			
		SmartPhone mySmartPhone = new SmartPhone("419-779-3203","TMobile");
		mySmartPhone.Call("440-675-8734", 5);
	  assertTrue("Not On a call", mySmartPhone.isOnCall());
	}
	@Test
	public void testAnswerPhone() {
			
		SmartPhone mySmartPhone = new SmartPhone("419-779-3203","TMobile");
		mySmartPhone.AnswerPhone();
	  assertTrue("Not On a call", mySmartPhone.isOnCall());
	}
	@Test
	public void testHangUp() {
			
		SmartPhone mySmartPhone = new SmartPhone("419-779-3203","TMobile");
		mySmartPhone.HangUp();
	  assertFalse("Not Hang up", mySmartPhone.isOnCall());
	}
	@Test
	public void testRechargeBattery() {
			
		SmartPhone mySmartPhone = new SmartPhone("419-779-3203","TMobile");
		mySmartPhone.RechargeBattery();
	  assertEquals("Not Charge", 95, mySmartPhone.getBatteryCharge());
}
}