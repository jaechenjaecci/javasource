package shop;

import java.util.Scanner;

public class IntegerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력해 주세요.");
		String input = sc.next();
		System.out.println(input + 5); 
		//더하기는 연결의 의미로 쓰여서 수에 더해진게 아니라 연결이 됨 

		int num = Integer.parseInt(input);
		System.out.println(num + 5);
	}

}
