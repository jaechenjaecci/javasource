package ClassText;

public class MyMath2 {

// �޼ҵ� �����ε�
// ���� : �޼ҵ� �̸��� ���ƾ� ��, �Ű������� ���� �Ǵ� Ÿ���� �޶�� ��
//       ��ȣ���� �޶�� ��
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
