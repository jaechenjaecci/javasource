import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		// 정수를 입력하고 마지막에 0을 입력하세요
		// 10 30 -20 40 0
		// 입력한 수의 개수는 4개이며, 평균은 15.0 입니다.

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하고, 마지막의 0을 입력하세요.\n");
		int num; // 입력받은 코드를 변수에 담음
		int count = 0;
		int sum = 0;

		while ((num = sc.nextInt()) != 0) {
			// 사용자에게 int값을 받고, num이라는 변수에 담고,
			// num이 0이 아니어야 함
			sum += num;
			count++;

		}

		System.out.printf("개수는 %d 개이고, 평균은 %.1f 입니다.\n", count, (double)sum / count);
    // 타입이 int인데 실수로 출력을 하려고 해서 오류가 남
    // sum을 형변환을 시켜 double을 주면 오류 없이 출력가능함
	// 마지막의 형변환을 안하려면 처음부터 sum을 double로 받아도 됨
		
	//System.out.print("개수는"+count+"개이고, 평균은"+sum/count+" 입니다.");
	}

}
