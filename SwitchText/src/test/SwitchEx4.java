package test;

public class SwitchEx4 {
	public static void main(String[] args) {
//int time =(int)(Math.random() * 4) + 8; => 0~3
		int time = (int) (Math.random() * 4) + 8;
	switch (time) {
	case 8:
		System.out.println("����� �մϴ�.");
		break;
	case 9:
		System.out.println("ȸ�Ǹ� �մϴ�.");
		break;
	case 10:
		System.out.println("������ ���ϴ�.");
		break;	
	default:
		System.out.println("�ܱ��� �����ϴ�.");
		break;
		
	}
	}

}
