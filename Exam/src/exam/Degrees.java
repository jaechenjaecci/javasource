package exam;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		// ȭ���µ� => �����µ�
		//
		// ȭ�� �µ� �Է� �ޱ�(����)
		// ���� ȭ�� �µ� => ���� �µ��� ��ȯ �� ���
		// (ȭ���µ� - 32) * 5/9
		Scanner k = new Scanner(System.in);
		//system.in�� Ű���带 �ǹ���
		
		System.out.print("ȭ���µ� : ");
		int fahr = k.nextInt();
		
		double x = (fahr-32)*5/9.0 ; //�Ǽ��� �޾ƾ� �ؼ� .0�� ����
		System.out.printf("���� �µ��� %.4f�� �Դϴ�.\n",x);
	}

}
