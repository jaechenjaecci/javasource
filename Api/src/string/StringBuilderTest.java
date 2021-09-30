package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		 String data = "ABC";
		// data +="DEF";
		// data+="";
		// 문자열은 변경,삭제가 안됨, 뒤에 붙이는 것도 안되서
		// 연결을 해서 매번 새로운 문자열을 만듦
		// 이런 작업이 계속될 수록 내부적으로 메모리가 파괴되고 다시 만들고가 반복
		// String에는 builder나 insert 메소드가 없음

		// 위에 있는 작업을 좀 더 효율적으로 하기 위해 만들어진 것
		// StringBuffer, StringBuilder
		// 메모리를 파괴하고 다시 만드는게 아니라, 문자열 뒤에 붙여나가는 방식임

		//멀티스레드 지원
		StringBuffer buffer = new StringBuffer();
		
		//단일스레드 지원
		StringBuilder builder = new StringBuilder();
		
		// 변경, 추가
		builder.append("ABC");
		builder.append("DEF");
		System.out.println("append : "+builder);

		// 삽입
		builder.insert(3, "34");
		System.out.println(builder);

		// 삭제
		builder.delete(1, 3);
		System.out.println(builder);

		String str1 = "Java Programming";
		StringBuilder builder1 = new StringBuilder(str1);
		// 미리 선언을 했는데 변경해야하는 부분이 많은 경우 다시 선언하면 됨
		builder1.append(3.14);
		builder1.deleteCharAt(1);
		System.out.println(builder1);

	}

}
