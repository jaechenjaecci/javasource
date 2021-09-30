package inheritance;

public class TV {
	
	String color;
	boolean power; 
	int channel;


	void channelUp() {
		channel++; 
	}
	void channelDown() {
		channel--;
	}
	void power() {
	
		power = !power; 
	}
}