package exam;

public class CastingEx1 {

	public static void main(String[] args) {
		int intValue = 44032; //44032='��'
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		double d = 3.14;
		intValue = (int) d;
		//ū���� ���� ������ �ű� �� �����͸� �Ҿ���� �� ����
		//��½� 3�� ��µ� (���� �ս��� �����Ҳ��� �����Ŀ� ���� �޶���)
		//Type mismatch: cannot convert from double to int
		System.out.println(intValue);

	}

}
