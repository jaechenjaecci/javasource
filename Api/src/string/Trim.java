package string;

public class Trim {

	public static void main(String[] args) {
		// ������ �����ϰ� ���ڰ� ��ġ�ϴ��� Ȯ���ϴ� �뵵�� ��
		// ���ڿ� ��,�� ���� ����
		String str1 = "    abc   ";
		String str2 = "abc";
		
		String newStr1 = str1.trim();
		
		
		System.out.println(str1);
		System.out.println(newStr1);
		
		System.out.println(str1.equals(str2));
		// ���� ��Ƽ� ����� �ʿ� �� �� ������ ������ �� ���
		System.out.println(newStr1.equals(str2));

	}
}

