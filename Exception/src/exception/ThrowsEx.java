package exception;

public class ThrowsEx {

	public static void main(String[] args) {
		//main에서 처리한다는 의미는 jvm한테 던져진다는 의미, 화면을 출력한다는 뜻
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	// 여기서 발생한 예외를 이 메소드를 호출하는 곳으로 던지겠음
	public static void findClass() throws ClassNotFoundException {
		Class.forName("");
	}
}
