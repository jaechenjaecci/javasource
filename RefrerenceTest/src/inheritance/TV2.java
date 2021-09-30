package inheritance;

public class TV2 {
	
	String color;
	boolean power; 
	private int channel;


//	public TV2() {
//		super();
//	}
	
	public TV2(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	void channelUp() {
		channel++; 
	}
	void channelDown() {
		channel--;
	}
	void power() {
	
		power = !power; 
	}

	public String getColor() {
		return color;
	}

	public boolean isPower() {
		return power;
	}

	public int getChannel() {
		return channel;
	}

}