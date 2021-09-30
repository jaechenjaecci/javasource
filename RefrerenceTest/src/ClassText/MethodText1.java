package ClassText;

// 리턴 타입 메소드명(){} => 기본형식
// void를 제외하고 타입명이 나오는 경우 무조건 retrun 값이 붙어야함. 없으면 강 뒤지는겨

public class MethodText1 {
// 리턴값이 true 혹은 false를 나타내는 메소드 생성
	boolean isRedirect() {
		return false;
	}

// 리턴값이 int 타입인 메소드 생성
	int sum() {
		return 3; // int로 된 것을 아무거나 보내야함 3은 임의의 숫자
	}

// 리텁값이 int, 두 개의 전달인자(둘다 int 타입)를 받기
	int multiply(int num1, int num2) {
		return num1 * num2;
	}

// 리턴값 : long, 두개의 전달인자(int)를 받기

	long add(long num1, long num2) {
		return num1 + num2;
	}

//리턴값 : char인 메소드
	char method() {
		return 'c'; // char 로 된 것을 아무거나 보내야함 c는 임의의 문자
	}

	void method1() { // 리턴이 불필요, 넘기는 값이 없음

	}

//리턴 타입 : int 1차원 배열
//전달인자 : int 1차원 배열
	int[] print(int arr[]) {
		return arr;
	}

//리턴타입 : double, 매개변수 : 두개의 double
//메소드가 해야할 일 : 받은 두개의 매개변수를 나누기한 결과 리턴
	double divide(double a, double b) {
		return a/b;
	}
	
	
}
