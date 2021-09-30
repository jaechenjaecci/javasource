package test;

import java.util.Scanner;

public class SwitchEx5 {
	public static void main(String[] args) {
		// 사용자한테 피 연산자 2개 입력 받기
		// 연산자 입력 받기 (+,-,*,/,%)
		// switch(연산자)
		// 연산 후 계산 결과 출력
		Scanner k = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		int num1 = k.nextInt();
		System.out.print("두번째 수 : ");
		int num2 = k.nextInt();
		System.out.print("연산입력(+,-,*,/,%) : ");
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
