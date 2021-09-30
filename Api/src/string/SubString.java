package string;

public class SubString {

	public static void main(String[] args) {
	String ssn = "880515-1220146";
	
	//문자열 잘라내기,
	System.out.println(ssn.substring(7));
	//7번째까지 잘라줌, 8번째부터 출력
	System.out.println(ssn.substring(0,6));
	//0에서 5까지 잘라줌, 6은 포함되지 않음, 하나 더 잡아야함
	}

}
