package looptext;

import java.util.Scanner;

public class DoWileText3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int answer = (int) (Math.random()* 100) + 1;
		int input = 0;
		do {

			System.out.print("예측한 숫자를 입력해주세요. >> ");
			input = sc.nextInt();

			if (input < answer) {
				System.out.println("좀 더 큰 수를 입력해보세요.");
			} else {
				System.out.println("좀 더 작은 수를 입력해보세요.");
			}

		} while (input != answer);
	}

}
