package looptext;

import java.util.Scanner;

public class DoWileText3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int answer = (int) (Math.random()* 100) + 1;
		int input = 0;
		do {

			System.out.print("������ ���ڸ� �Է����ּ���. >> ");
			input = sc.nextInt();

			if (input < answer) {
				System.out.println("�� �� ū ���� �Է��غ�����.");
			} else {
				System.out.println("�� �� ���� ���� �Է��غ�����.");
			}

		} while (input != answer);
	}

}
