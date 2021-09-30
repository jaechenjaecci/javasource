package object;

public class ObjectEx2 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		//toString => 객체를 문자열로 표현 (부모가 넘겨줄 경우 이것만 가능)
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		
		// equals(주소비교) => false
		// 반환타입이 있으면 출력하거나, 받아야함
		System.out.println(obj1.equals(obj2));

		// String이 사용하는 equals,toString은 오버라이딩이 적용된 것
		// 객체가 가지고 있는 값을 비교하고, 출력하도록 오버라이딩 되어 있음
		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println(str1.toString());
		System.out.println(str2.toString());

		Value value1 = new Value(10);
		Value value2 = new Value(10);
		//toString() => 값을 출력할 수 있도록 오버라이딩을 해줘야함
		System.out.println(value1.toString());
		System.out.println(value2.toString());
	}

}
