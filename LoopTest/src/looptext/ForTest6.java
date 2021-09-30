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
			} // %d에서 d앞에 숫자를 붙이면 정수를 쓸 때 2칸을
				// 쓸꺼야라고 명령되어서 오른쪽 부터 정렬됨
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