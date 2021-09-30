package ClassText;

public class MethodEx2 {

	public static void main(String[] args) {
		// 객체 생성
		MethodTest2 obj = new MethodTest2();
		// 구구단 출력
		obj.print99dan();

		// 덧셈기능
		// 메소드를 호출하는 곳에서 입력값 넣어주기
		// 객체를 만들고, .찍어서 부르는 것을 호출이라 함
		
		byte b1 = 3;
		byte b2 = 5; 
		
		obj.sum(b1, b2);
		

	}

}
