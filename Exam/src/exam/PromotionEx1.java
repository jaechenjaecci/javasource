package exam;

public class PromotionEx1 {

	public static void main(String[] args) {
		// 변수 선언
		// 정수타입 => byte(1byte) < char(2byte) < short(2byte) < int(4byte) < long(8byte)
		//           2^8(256) = 8bit
		// 실수타입 => float(4byte) < double(8byte)
		byte byteValue = 10; // byte안에 -127~127까지만 입력 가능한데 128을 넣으면 오류
		
		
		//자동형변환(promotion) : 작은 것은 큰 그릇으로 옮긴 경우, 데이터의 변화는 없음
		int intValue = byteValue; //byte를 int에 옮겨 담음
		System.out.println(intValue);
		
		intValue = 500;
		long longValue = intValue;
		char charValue = 'A';
		char charValue2 = 1;
		
		int charValue3 = charValue+charValue2; //'A'+1
		
		
		System.out.println(charValue3); 
		// =66 (?아스키코드 A=65이기때문에 일을 더한 66이 결과로 나옴 
		// 대문자 A는 65, 소문자 a는 97만이라도 기억하거라
		
		// 강제형변환(casting)
		// int를 강제로 char로 변환시킴
		System.out.println((char)charValue3);
		// =B 문자로 강제로 변환하여 나옴
		
		
		
	}

}
