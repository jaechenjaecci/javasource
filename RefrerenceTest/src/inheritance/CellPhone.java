package inheritance;

public class CellPhone {

	String model;
	String color;
	
	void powerOn() {
		System.out.println("���� ON");
	}
	void powerOff() {
		System.out.println("���� OFF");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	void sendVoice(String msg) {
		System.out.println("���� : "+msg);
	}
	void receiveVoice(String msg) {
		System.out.println("���� : "+msg);
	}
	void handUp( ) {
		System.out.println("��ȭ�� �����ϴ�.");
	}
	
}
