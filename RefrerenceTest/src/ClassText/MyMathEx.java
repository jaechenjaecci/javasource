package ClassText;

public class MyMathEx {

	public static void main(String[] args) {
	//static �޼ҵ�(Ŭ�����޼ҵ�) ȣ���ϱ� => ��ü���� ���� ȣ����
		System.out.println(MyMath.add(200L, 200L));
		System.out.println(MyMath.subtrack(200L, 100L));
		System.out.println(MyMath.multiply(200L, 100L));
		System.out.println(MyMath.divide(200L, 100L));
	
		System.out.println();
	
		//��� �޼ҵ� ȣ��
		//��ü ������ �ؾ� �޸𸮿� �ڸ��� ��� ��ٸ��ٴ� ��
		MyMath mymath = new MyMath();
		
		mymath.a=200L;
		mymath.b=100L;	
				
		System.out.println(mymath.add());
		System.out.println(mymath.subtrack());
		System.out.println(mymath.multiply());
		System.out.println(mymath.divide());
		
	}

}
