import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		// ������ �Է��ϰ� �������� 0�� �Է��ϼ���
		// 10 30 -20 40 0
		// �Է��� ���� ������ 4���̸�, ����� 15.0 �Դϴ�.

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϰ�, �������� 0�� �Է��ϼ���.\n");
		int num; // �Է¹��� �ڵ带 ������ ����
		int count = 0;
		int sum = 0;

		while ((num = sc.nextInt()) != 0) {
			// ����ڿ��� int���� �ް�, num�̶�� ������ ���,
			// num�� 0�� �ƴϾ�� ��
			sum += num;
			count++;

		}

		System.out.printf("������ %d ���̰�, ����� %.1f �Դϴ�.\n", count, (double)sum / count);
    // Ÿ���� int�ε� �Ǽ��� ����� �Ϸ��� �ؼ� ������ ��
    // sum�� ����ȯ�� ���� double�� �ָ� ���� ���� ��°�����
	// �������� ����ȯ�� ���Ϸ��� ó������ sum�� double�� �޾Ƶ� ��
		
	//System.out.print("������"+count+"���̰�, �����"+sum/count+" �Դϴ�.");
	}

}
