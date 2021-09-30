import java.util.Scanner;

public class CSMain2 {
	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		System.out.print("중간고사 : ");
		int MidText = A.nextInt();
		System.out.print("기말고사 : ");
		int FinalText = A.nextInt();
		System.out.println(" ---------------- ");
		double x = (MidText + FinalText) / 2.0;
		System.out.printf("평균 : %.1f점\n", x);

		if (x >= 90) {
			System.out.println("수");
		} else if (x >= 80) {
			System.out.println("우");
		} else if (x >= 70) {
			System.out.println("미");
		} else if (x >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}

	}
}