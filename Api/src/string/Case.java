package string;

public class Case {

	public static void main(String[] args) {
		// ��ҹ��� ����
		String str1 = "Java programming";
		String str2 = "JAVA programming";
		
		System.out.println(str1.equals(str2));
		//��ҹ��ڰ� �ٸ��� false�� ����
		
		System.out.println(str1.equalsIgnoreCase(str2));
		//equalsIgnoreCase�� ��ҹ��ڸ� ������ ���� ������ Ȯ������

		System.out.println(str1.toUpperCase());
		//��� �빮�ڷ� �����ϴ� ���
		System.out.println(str1);
		//�� ���ڿ��� ����� ���� �ƴϱ⶧���� ������� �� ������� ����
		//str�� ��µ�
		System.out.println(str2.toLowerCase());
		//��� �ҹ��ڷ� �����ϴ� ���
	}	//�̰� �̿��� ��ҹ��ڸ� ���� �� equals�� �������� �˻��ϱ⵵ ��

}
