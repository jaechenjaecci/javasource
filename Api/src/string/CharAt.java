package string;

public class CharAt {

	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		
		// 0번 부터 시작해서 3번째 있는 위치에 글자 출력 (공백포함)
		char ch = str1.charAt(3);
		// 문자를 문자열로 바꾸는 것은 charAt
		System.out.println(ch);

		System.out.println();

		// str에 '그'라는 문자가 있는지 확인하고 들어있다면
		// 포함하고 있음, 없다고 포함하고 있지 않음 출력
		boolean flag = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == '그') {
				flag = true;
				break;

			}
		}
		System.out.println(flag ? "포함하고 있음" : "포함하고 있지 않음");
		System.out.println();

		String str2 = "Hello Java!!";

		// str2를 char 배열에 담고 그 배열을 출력
		char chArr[] = new char[str2.length()];
		for (int i = 0; i < str2.length(); i++) {
			chArr[i] = str2.charAt(i);
		}
		for (char ch1 : chArr) {
			System.out.printf("%c", ch1);
		}
	}

}
