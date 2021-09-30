package ClassText;

public class MyMath2 {

// 메소드 오버로딩
// 조건 : 메소드 이름이 같아야 함, 매개변수의 개수 또는 타입이 달라야 함
//       괄호안이 달라야 함
	int add(int a, int b) {
		System.out.println();
		return a + b;

	}

	long add(long a, long b) {
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	long add(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];

		}
		return result;
	}
}
