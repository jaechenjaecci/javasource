
public class Exam13 {

	public static void main(String[] args) {
		int arr[][] = new int[3][2];
		
		// length를 걸면 무조건 행의 길이가 나옴
		System.out.println("행의 길이" + arr.length);
		System.out.println("열의 길이" + arr[0].length);

		for (int i = 0; i < arr.length; i++) {
			// 행의 길이까지 돌아줘의 의미
			for (int j = 0; j < arr[i].length; j++) {
				// 열의 길이까지 돌아줘의 의미
				arr[i][j] = j + 1;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			// 행의 길이까지 돌아줘의 의미
			for (int j = 0; j < arr[i].length; j++) {
				// 열의 길이까지 돌아줘의 의미
				System.out.printf("%2d", arr[i][j]);
				;

			}
			System.out.println();
		}
	}
}