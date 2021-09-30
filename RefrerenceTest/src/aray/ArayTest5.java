package aray;

public class ArayTest5 {

	public static void main(String[] args) {
		// 문자 => 하나를 의미 (char, 'A', 작은 따옴표를 이용해 표현)
		// 문자열 => 여러개를 의미 (String, "ABC", 큰 따옴표를 이용해 표현)
		// char 배열 선언, 생성, 초기화
		
		char chArr[] = {'a', 'n','s','w','e','r'};
	//	char[] chArr = {'a', 'n','s','w','e','r'};  대가로의 위치는 둘 중 어디든 있어도 상관 없음
		char chArr2[] = {'a', 'n','s','w','e','r'};
		
		for(char ch :chArr) {
			System.out.print(ch);
		}
	}

}
