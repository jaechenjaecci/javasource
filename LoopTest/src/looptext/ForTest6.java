package looptext;

public class ForTest6 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
		System.out.println();
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %2d\t", i, j, i * j);
			} // %d���� d�տ� ���ڸ� ���̸� ������ �� �� 2ĭ��
				// �����߶�� ��ɵǾ ������ ���� ���ĵ�
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= i ; j++) {
				
			System.out.print("*");
			}
		System.out.println();
		}
	}
}