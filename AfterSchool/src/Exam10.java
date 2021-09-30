import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		// int 타입을 5개 저장하는 배열 생성
		// 배열의 초기화를 위해 사용자로부터 입력 받기
		// 입력받은 값 출력
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		System.out.println("5명의 점수를 입력하세요.");

		for (int i = 0; i < arr.length; i++) {
			// for문은 무조건 배열 수로 깔아놓기 시작하면 됨
			System.out.print((i + 1) + "번째 점수 입력 : ");
			// 계속 변하는 수는 i에 있으니까 i를 출력
			// i는 0번부터 시작하니까 1을 더해줌
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.printf("총합은 %d 이고, 평균은 %.1f 입니다.", sum, (double)sum/arr.length);


	}

}
