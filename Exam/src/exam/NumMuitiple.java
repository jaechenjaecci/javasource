package exam;

import java.util.Scanner;

public class NumMuitiple {

	public static void main(String[] args) {
		//���� num�� ������ ũ�鼭�� ���� ����� 10�� ������� ���� num
		//�� ���� �� �������� ���Ͻÿ�
		//ex)num�� 24��� ũ�鼭�� ���� ����� 10�� ����� 30��
		//num = 18,20
		
	//	int num = 81;
	//	System.out.println((10-(num%10))*10); //90
Scanner k = new Scanner(System.in);

	System.out.print("���ڸ� �Է��ϼ���!");
	int num = k.nextInt();
	
	System.out.println((num/10+1)*10);
	}
}
