package exam;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		// 화씨온도 => 섭씨온도
		//
		// 화씨 온도 입력 받기(정수)
		// 받은 화씨 온도 => 섭씨 온도로 변환 후 출력
		// (화씨온도 - 32) * 5/9
		Scanner k = new Scanner(System.in);
		//system.in은 키보드를 의미함
		
		System.out.print("화씨온도 : ");
		int fahr = k.nextInt();
		
		double x = (fahr-32)*5/9.0 ; //실수로 받아야 해서 .0을 붙임
		System.out.printf("섭씨 온도는 %.4f도 입니다.\n",x);
	}

}
