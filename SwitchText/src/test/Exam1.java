package test;

import javax.swing.text.PlainDocument;

public class Exam1 {

	public static void main(String[] args) {
	//�ֻ��� �� �� ������
	//������ �ֻ��� �� ��� (1,4)
	//�ֻ��� ���� �հ谡 5�� �ƴϸ� �ֻ����� ��� ������,
    //5�� �Ǹ� ������ ���߱�
		
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