
public class Exam13 {

	public static void main(String[] args) {
		int arr[][] = new int[3][2];
		
		// length�� �ɸ� ������ ���� ���̰� ����
		System.out.println("���� ����" + arr.length);
		System.out.println("���� ����" + arr[0].length);

		for (int i = 0; i < arr.length; i++) {
			// ���� ���̱��� �������� �ǹ�
			for (int j = 0; j < arr[i].length; j++) {
				// ���� ���̱��� �������� �ǹ�
				arr[i][j] = j + 1;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			// ���� ���̱��� �������� �ǹ�
			for (int j = 0; j < arr[i].length; j++) {
				// ���� ���̱��� �������� �ǹ�
				System.out.printf("%2d", arr[i][j]);
				;

			}
			System.out.println();
		}
	}
}