package string;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		String str1 = "Hello Java!!";

		// String 형태로 놓고, 거꾸로 출력
		char[] chArr = str1.toCharArray();
		// 캐릭터 배열로 리턴해줌
		for (int i = chArr.length - 1; i >= 0; i--) {
			System.out.print(chArr[i]);
		}
		
		System.out.println();
		
		// StringBuilder 거꾸로 출력
		StringBuilder builder = new StringBuilder(str1);
		System.out.println(builder.reverse());
	}

}
