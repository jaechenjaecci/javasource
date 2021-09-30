package object;

public class ObjectEx1 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		// equals(주소비교) => false
		// 반환타입이 있으면 출력하거나, 받아야함
		System.out.println(obj1.equals(obj2));

		// String이 사용하는 equals는 오버라이딩이 적용된 것
		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println(str1.equals(str2));

		Value value1 = new Value(10);
		Value value2 = new Value(10);
		System.out.println(value1.equals(value2));
	}

}
