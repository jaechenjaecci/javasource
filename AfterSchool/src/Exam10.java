import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		// int Ÿ���� 5�� �����ϴ� �迭 ����
		// �迭�� �ʱ�ȭ�� ���� ����ڷκ��� �Է� �ޱ�
		// �Է¹��� �� ���
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		System.out.println("5���� ������ �Է��ϼ���.");

		for (int i = 0; i < arr.length; i++) {
			// for���� ������ �迭 ���� ��Ƴ��� �����ϸ� ��
			System.out.print((i + 1) + "��° ���� �Է� : ");
			// ��� ���ϴ� ���� i�� �����ϱ� i�� ���
			// i�� 0������ �����ϴϱ� 1�� ������
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.printf("������ %d �̰�, ����� %.1f �Դϴ�.", sum, (double)sum/arr.length);


	}

}
