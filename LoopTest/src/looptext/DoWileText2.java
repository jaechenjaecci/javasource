package looptext;

import java.util.Scanner;

public class DoWileText2 {

	public static void main(String[] args) {
		
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");

		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print("> ");
			inputString = sc.nextLine();
		} while(!inputString.equals("q"));
		//q�� �ƴ� ������ ����
		
		
		System.out.println("���α׷� ����");
	
	}

}
