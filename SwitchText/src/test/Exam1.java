package test;

import javax.swing.text.PlainDocument;

public class Exam1 {

	public static void main(String[] args) {
	//주사위 두 개 던지기
	//나오는 주사위 눈 출력 (1,4)
	//주사위 눈의 합계가 5가 아니면 주사위를 계속 던지고,
    //5가 되면 실행을 멈추기
		
		while(true) {
		int player1 = (int) (Math.random() * 6) + 1;
		int player2 = (int) (Math.random() * 6) + 1;
		
		System.out.printf("(%d, %d)\n", player1,player2);
		if(player1+player2 == 5) {
			break;
		}
	}

}
}