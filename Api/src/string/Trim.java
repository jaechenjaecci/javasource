package string;

public class Trim {

	public static void main(String[] args) {
		// 공백을 제거하고 문자가 일치하는지 확인하는 용도로 씀
		// 문자열 앞,뒤 공백 제거
		String str1 = "    abc   ";
		String str2 = "abc";
		
		String newStr1 = str1.trim();
		
		
		System.out.println(str1);
		System.out.println(newStr1);
		
		System.out.println(str1.equals(str2));
		// 새로 담아서 출력이 필요 앞 뒤 공백을 제거한 뒤 출력
		System.out.println(newStr1.equals(str2));

	}
}

