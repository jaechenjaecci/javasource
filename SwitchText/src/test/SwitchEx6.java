package test;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) {
	//����(1),����(2),��(3)
	//����(��ǻ��)
	//�������� ���
	Scanner k = new Scanner(System.in);
		
	int computer =(int)(Math.random() * 3)+1;
	
	System.out.print("����(1),����(2),��(3) �ϳ��� �Է��ϼ���.");
	int user = k.nextInt();
	
	System.out.println("�� :"+user+", ��ǻ�� :"+computer);
	
	switch (user-computer) {
	case 1 : case -2 :  //��� ��쿡 ������ �̱�� ��� ���� �� �ִ� ���� �ɾ����
	System.out.println("����� �̰���ϴ�.");
		break;
	case 2 : case -1 : //��� ��쿡 ������ ���� ��� ���� �� �ִ� ���� �ɾ����
		System.out.println("����� �����ϴ�.");
			break;
	case 0 :
		System.out.println("�����ϴ�.");
			break;
			
	}
	
	
	
	}

}
