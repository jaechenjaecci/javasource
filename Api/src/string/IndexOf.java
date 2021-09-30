package string;

public class IndexOf {
public static void main(String[] args) {
	String str1 = "자바 프로그래밍";
	
	//매개값으로 주어진 문자열이 시작되는 위치를 리턴
	int index= str1.indexOf("프로그래밍");
	
	System.out.println(index);
	System.out.println("못찾는 경우 "+str1.indexOf("파이썬"));
	
	System.out.println();
	
	String str2 = "HelloHelloHello World";
	
	System.out.println(str2.indexOf(65));
	//int ch가 의미하는 것은 아스키코드를 이용해 숫자를 입력하면
	//그 문자에 해당하는 것을 찾아달라고 사용할 수 있음 (대문자 A)
	//못찾으면 -1
	System.out.println(str2.indexOf('f'));
	System.out.println(str2.indexOf("el",2));
	//el를 찾는데 두번째 위치부터 찾으라는 뜻
	//여섯번째 위치하다고 출력됨
	
	System.out.println("l찾기 "+str2.lastIndexOf("l"));
	// 뒤에서 부터 시작해서 l을 찾아달라는 뜻
	
	//그가 들어있는지 확인
	System.out.println(str1.indexOf("그")>-1?"포함하고 있지 않음"
			:"포함하고 있지 않음");
	// 포함하고 있지 않을 경우 -1이 나오기 때문에 -1보다 크다면 포함되어 있는것
}
}
