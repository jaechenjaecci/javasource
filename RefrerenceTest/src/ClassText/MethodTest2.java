package ClassText;

public class MethodTest2 {
	//두개의 숫자를 받아서 더한 결과를 보내주기
	
	//정수형의 두개의 숫자를 받음(입력값)
	int sum(int num1, int num2) {
		int result = num1+num2;
		return result; // (출력값,반환값)
	// return num1 + num2; 한줄로도 가능
	}


	// 구구단을 2단부터 9단까지 출력하기(보내지X)
	// 입력값 : 없음(가로 안이 비어있음), 반환값 : 없음(void)
	void print99dan() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i,j,i*j);
			}
		}
	}
	
	// 두개의 정수를 받아서(입력값) 곱하기 한 결과를 리턴(반환값)하기
	int multiply(int x, int y) {
		return x*y;
		
	}
	
	



}
