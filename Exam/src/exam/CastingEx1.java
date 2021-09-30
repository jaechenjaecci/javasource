package exam;

public class CastingEx1 {

	public static void main(String[] args) {
		int intValue = 44032; //44032='가'
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		double d = 3.14;
		intValue = (int) d;
		//큰것을 작은 것으로 옮길 때 데이터를 잃어버릴 수 있음
		//출력시 3만 출력됨 (값의 손실을 감수할꺼나 말꺼냐에 따라서 달라짐)
		//Type mismatch: cannot convert from double to int
		System.out.println(intValue);

	}

}
