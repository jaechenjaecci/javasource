package ClassText;

public class TV3 {

	private String color;
	private boolean power; 
	private int channel;

	
	TV3(){
	}
	
	TV3(String color,boolean power,int channel){
		this.color = color;
		this.channel = channel; 
		this.power = power;
		
	}
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	
	}

	
	// 동작(메소드) => 채널변경(증가,감소), 전원온오프....
	void channelUp() {
		channel++; // channelUp가 해야하는 작업을 기록하는 공간, 채널을 높이기 위해서는 숫자를 하나씩 증가시켜야함
	}

	void channelDown() {
		channel--; // channelUp가 해야하는 작업을 기록하는 공간, 채널을 높이기 위해서는 숫자를 하나씩 감소시켜야함
	}

	void power() {
		// power가 해야하는 작업을 기록하는 공간
		power = !power; //가진 값에서 부정을 시키면, 온오프가 바꿔짐
	}
}