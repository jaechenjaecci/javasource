package test;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		boolean run = true;
		// 잔액
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		while (run) {
			System.out.println("===============================");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("================================");
			System.out.print("선택 >>>");
			
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.print("입금할 금액을 입력하세요 : ");
				balance += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액을 입력하세요. : ");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔액은 : " + balance + "  원입니다. ");
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("메뉴확인");
				break;

			// 1선택 : 사용자에게 예금액 입력 받기 => 입력받은 금액은 balance에 추가
			// 2선택 : 사용자에게 출금액 입력 받기 => 입력받은 금액은 balance에 차감
			// 3선택 : balance 출력
			// 4선택 : run = false로 변경 후 프로그램 종료
			}
		}
	}

}
