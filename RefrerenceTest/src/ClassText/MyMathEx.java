package ClassText;

public class MyMathEx {

	public static void main(String[] args) {
	//static 메소드(클래스메소드) 호출하기 => 객체생성 없이 호출함
		System.out.println(MyMath.add(200L, 200L));
		System.out.println(MyMath.subtrack(200L, 100L));
		System.out.println(MyMath.multiply(200L, 100L));
		System.out.println(MyMath.divide(200L, 100L));
	
		System.out.println();
	
		//멤버 메소드 호출
		//객체 생성을 해야 메모리에 자리를 잡고 기다린다는 뜻
		MyMath mymath = new MyMath();
		
		mymath.a=200L;
		mymath.b=100L;	
				
		System.out.println(mymath.add());
		System.out.println(mymath.subtrack());
		System.out.println(mymath.multiply());
		System.out.println(mymath.divide());
		
	}

}
