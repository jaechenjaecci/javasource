package looptext;

public class ForTest2 {
	public static void main(String[] args) {
		int sum = 0; // sum은 main이 종료가 되어야 끝남
		for (int i = 1; i < 11; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		System.out.println();

		sum = 0; //작업 전 초기화
		for (int i = 1; i < 101; i++) {
			sum = sum + i;
		}
		System.out.println("1~100까지의 합 : "+sum);
	}
}
