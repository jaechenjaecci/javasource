package test;

import java.util.Scanner;

public class SwitchEx5 {
	public static void main(String[] args) {
		// ��������� �� ������ 2�� �Է� �ޱ�
		// ������ �Է� �ޱ� (+,-,*,/,%)
		// switch(������)
		// ���� �� ��� ��� ���
		Scanner k = new Scanner(System.in);
		System.out.print("ù��° �� : ");
		int num1 = k.nextInt();
		System.out.print("�ι�° �� : ");
		int num2 = k.nextInt();
		System.out.print("�����Է�(+,-,*,/,%) : ");
		String oper = k.next();
		int result = 0;

		switch (oper) {
		case "+":
			// System.out.println(num1+oper+num2+"="+(num1+num2));
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			// System.out.println(num1 + oper + num2 + "=" + (num1 - num2));
			break;
		case "*":
			result = num1 * num2;
			// System.out.println(num1 + oper + num2 + "=" + (num1 * num2));
			break;
		case "/":
			result = num1 / num2;
			// System.out.println(num1 + oper + num2 + "=" + (num1 / num2));
			break;
		case "%":
			result = num1 % num2;
			// System.out.println(num1 + oper + num2 + "=" + (num1 % num2));
			break;
		}
System.out.printf("%d %s %s = %d", num1, oper, num2, result);
	}

}
