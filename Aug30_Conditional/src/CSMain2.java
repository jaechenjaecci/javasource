import java.util.Scanner;

public class CSMain2 {
	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		System.out.print("�߰���� : ");
		int MidText = A.nextInt();
		System.out.print("�⸻��� : ");
		int FinalText = A.nextInt();
		System.out.println(" ---------------- ");
		double x = (MidText + FinalText) / 2.0;
		System.out.printf("��� : %.1f��\n", x);

		if (x >= 90) {
			System.out.println("��");
		} else if (x >= 80) {
			System.out.println("��");
		} else if (x >= 70) {
			System.out.println("��");
		} else if (x >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}

	}
}