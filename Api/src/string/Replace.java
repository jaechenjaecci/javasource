package string;

public class Replace {

	public static void main(String[] args) {
		String str1 = "�ڹٴ� ��ü���� ����Դϴ�. "
				+ "�ڹٴ� ǳ���� API�� �����մϴ�.";
		// �ѱ��� ����� ��ȯ (�ڹ� -> java)
		// String�� ������ ����, ó���� ������ ���� ���� �Ұ�
		// ��ü�� ������ ���� ����, ������ �ִ� ���ڿ��� ���ְ�,
		// ������ ���� �ٽ� ��ƾ� ��
		//str1= str1.replace("�ڹ�", "java");
		//System.out.println(str1);
	
		str1 = str1.replaceFirst("�ڹ�", "java");
		System.out.println(str1);
	

	}

}
