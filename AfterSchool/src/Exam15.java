import java.util.Scanner;

public class Exam15 {
	public static void main(String[] args) {
		// 3���� �л��� �ְ�, 3���� ���� ������ �Է¹ޱ�
		// 2���� �迭
		// �Է¹ް�, ���
		// �� �л��� ���� ���հ� ��� ���

		int student[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		System.out.println("�л��� ���� ������ �Է��ϼ���.");
		for (int i = 0; i < student.length; i++) {
			System.out.printf("%d��\n",i + 1);
			for (int j = 0; j < student[i].length; j++) {
				student[i][j] = sc.nextInt();
			}
		}
		System.out.println("----------------�л���������Ȳ--------------");
		System.out.println("��ȣ\tjava\thtml\tspring\t����\t���");
		System.out.println("---------------------------------------");

		for (int i = 0; i < student.length; i++) {
			System.out.printf("%d��\t" , i + 1);
			for (int j = 0; j < student[i].length; j++) {
				System.out.print(student[i][j] + "\t");
				sum += student[i][j];
			}
			System.out.printf("%d\t%.1f\n", sum, (double) sum / student[i].length);
			sum=0;
		}
	}
}