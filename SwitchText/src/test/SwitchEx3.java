package test;

import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("직급을 입력하세요. :");
		String position = k.next();
		
		switch (position) {
		case "부장":
			System.out.println("700만원 지급됩니다.");
			break;
		case "과장":
			System.out.println("500만원 지급됩니다.");
			break;
		default:
			System.out.println("300만원 지급됩니다.");
			break;
		}
	}

}
