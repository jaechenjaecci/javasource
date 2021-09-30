package string;

public class Case {

	public static void main(String[] args) {
		// 대소문자 변경
		String str1 = "Java programming";
		String str2 = "JAVA programming";
		
		System.out.println(str1.equals(str2));
		//대소문자가 다르면 false가 나옴
		
		System.out.println(str1.equalsIgnoreCase(str2));
		//equalsIgnoreCase는 대소문자를 비교하지 말고 같은지 확인해줘

		System.out.println(str1.toUpperCase());
		//모두 대문자로 변경하는 방법
		System.out.println(str1);
		//원 문자열이 변경된 것이 아니기때문에 출력했을 때 변경되지 않은
		//str이 출력됨
		System.out.println(str2.toLowerCase());
		//모두 소문자로 변경하는 방법
	}	//이걸 이용해 대소문자를 맞춘 후 equals로 동일한지 검사하기도 함

}
