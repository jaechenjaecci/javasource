
public class Exam6 {

	public static void main(String[] args) {
		// 소문자 a-z까지 출력

		for (char ch = 'a'; ch <= 'z'; ch++) {
			
		//한 글자 변수를 지정하고, 범위를 설정, 그리고 1개씩 증가 (아스키코드생각!)
			System.out.print(ch + " ");
		}
		System.out.println();
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}

		System.out.println();
		for (char ch ='ㄱ'; ch<='ㅎ'; ch++) {
		System.out.print(ch+" ");
		// 한글은 출력이 안됨
	}
	}
}