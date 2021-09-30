package ClassText;

public class MethodTextEx {

	public static void main(String[] args) {
		MethodText1 obj = new MethodText1();
		
		//메소드 호출 시 리턴되는 값이 있는 경우
		//print() or 리턴 되는 값 받기 : 둘 중에 하나 하면 됨
		
		System.out.println(obj.isRedirect());
		//리턴되는 값이 그대로 출력됨
		boolean result =obj.isRedirect();
		//리턴 되는 값을 받는 경우 보내는 타입과 같은 자료형으로 설정해야함
		//리턴되는 값을 받는 다는 것 보내는값을 저장한다는 것
		//result를 지정했기 때문에 result를 이용해 코드 작성이 가능
		
		int var1 = obj.sum();
		System.out.println(obj.add(25, 35));
		
		
		
		
		
		
		
		
		
	}

}
