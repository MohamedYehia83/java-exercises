package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelevisionTest {
	Television myTelevision = new Television();

	
		@Test
		public void testIsOn() {
				
			Television myTelevision = new Television();
			myTelevision.IsOn();
		  assertTrue("Not On", myTelevision.IsOn());
		}
		
		@Test
		public void testSelectedChannel() {
				
			Television myTelevision = new Television();
			
		  assertEquals("Not the right channel", myTelevision.getSelectedChannel());
		}
		
		@Test
		public void testCurrentVolume() {
				
			Television myTelevision = new Television();
			
		  assertEquals("Not the right channel", myTelevision.getCurrentVolume());
		}
		
		@Test
		public void testTurnOn() {
				
			myTelevision.IsOn();
		  assertTrue("Current volume level resets to 2", myTelevision.IsOn());
		  assertFalse("TV is off", myTelevision.IsOn());
		}
		
		@Test
		public void testChangeChannel1() {
				
			myTelevision.ChangeChannel(19);
			assertFalse("Channel should not be set to 19",myTelevision.getSelectedChannel()>=19);
		}

		@Test
		public void testChangeChannel() {
				
			myTelevision.ChangeChannel(3);
			assertFalse("Channel should not be set to 2",myTelevision.getSelectedChannel()<=2);
		}

		@Test
		public void testRaiseVolume() {
				
			myTelevision.getCurrentVolume();
			assertFalse("Volume should not past 10",myTelevision.getCurrentVolume()>=11);
		}
		
		@Test
		public void testLowerVolume() {
				
			myTelevision.getCurrentVolume();
			assertFalse("Volume should not get below 0",myTelevision.getCurrentVolume()==0);
		}
}


