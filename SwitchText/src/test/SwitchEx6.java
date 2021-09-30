package test;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) {
	//가위(1),바위(2),보(3)
	//상대방(컴퓨터)
	//랜덤으로 사용
	Scanner k = new Scanner(System.in);
		
	int computer =(int)(Math.random() * 3)+1;
	
	System.out.print("가위(1),바위(2),보(3) 하나를 입력하세요.");
	int user = k.nextInt();
	
	System.out.println("나 :"+user+", 컴퓨터 :"+computer);
	
	switch (user-computer) {
	case 1 : case -2 :  //모든 경우에 수에서 이기는 경우 나올 수 있는 수를 걸어놓음
	System.out.println("당신이 이겼습니다.");
		break;
	case 2 : case -1 : //모든 경우에 수에서 지는 경우 나올 수 있는 수를 걸어놓음
		System.out.println("당신이 졌습니다.");
			break;
	case 0 :
		System.out.println("비겼습니다.");
			break;
			
	}
	
	
	
	}

}
