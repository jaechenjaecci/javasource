package string;

public class SubString {

	public static void main(String[] args) {
	String ssn = "880515-1220146";
	
	//���ڿ� �߶󳻱�,
	System.out.println(ssn.substring(7));
	//7��°���� �߶���, 8��°���� ���
	System.out.println(ssn.substring(0,6));
	//0���� 5���� �߶���, 6�� ���Ե��� ����, �ϳ� �� ��ƾ���
	}

}
