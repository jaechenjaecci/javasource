
public class MessageMain {

	public static void main(String[] args) {

		// => 객체생성 => 아래의 두 가지 방식을 허용하는 형태는 extends, implement
		Email email = new Email("성춘향", "안녕하세요", "홍길동", "안녕");
		Message message = new Email("성춘향", "안녕하세요", "홍길동", "안녕");
		// 두개의 차이는 거의 없음
	}

}
