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

	
	// ����(�޼ҵ�) => ä�κ���(����,����), �����¿���....
	void channelUp() {
		channel++; // channelUp�� �ؾ��ϴ� �۾��� ����ϴ� ����, ä���� ���̱� ���ؼ��� ���ڸ� �ϳ��� �������Ѿ���
	}

	void channelDown() {
		channel--; // channelUp�� �ؾ��ϴ� �۾��� ����ϴ� ����, ä���� ���̱� ���ؼ��� ���ڸ� �ϳ��� ���ҽ��Ѿ���
	}

	void power() {
		// power�� �ؾ��ϴ� �۾��� ����ϴ� ����
		power = !power; //���� ������ ������ ��Ű��, �¿����� �ٲ���
	}
}