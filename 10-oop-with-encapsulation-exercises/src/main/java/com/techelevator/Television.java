package com.techelevator;

public class Television {
	private int currentChannel;
	private int currentVolume;
	private boolean isOn;
	
	public void turnOff(){
        isOn = false;
    }
	 
	public void turnOn() {
	        isOn = true;      
	        currentChannel = 3;
	        currentVolume = 2;
	    }
	
	
	
	 public void changeChannel(int newChannel) {
	        if (isOn && newChannel > 3 && newChannel < 18) {
	            currentChannel = newChannel;
	        }
	    }
	    public void channelUp()
	    {
	        if (isOn) {
	            if (currentChannel > 18) {
	                currentChannel = 3;
	            }
	            else {
	                currentChannel =+ 1;
	            }                
	        }
	    }

	    public void channelDown() {
	        if (isOn) {
	            if (currentChannel < 3) {
	                currentChannel = 18;
	            }
	            else {
	                currentChannel -= 1;
	            }
	        }
	    }
	    
	    public void raiseVolume() {
	        if(isOn && currentVolume < 10) {
	            currentVolume += 1;
	        }
	    }

	    public void lowerVolume() {
	        if (isOn && currentVolume > 0) {
	            currentVolume -= 1;
	        }
	    }

	
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	public boolean isOn() {
		return isOn;
	}

}
