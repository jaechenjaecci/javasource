package test;

public class SwitchEx4 {
	public static void main(String[] args) {
//int time =(int)(Math.random() * 4) + 8; => 0~3
		int time = (int) (Math.random() * 4) + 8;
	switch (time) {
	case 8:
		System.out.println("출근을 합니다.");
		break;
	case 9:
		System.out.println("회의를 합니다.");
		break;
	case 10:
		System.out.println("업무를 봅니다.");
		break;	
	default:
		System.out.println("외근을 나갑니다.");
		break;
		
	}
	}

}
