package string;

public class CharAt {

	public static void main(String[] args) {
		String str1 = "�ڹ� ���α׷���";
		
		// 0�� ���� �����ؼ� 3��° �ִ� ��ġ�� ���� ��� (��������)
		char ch = str1.charAt(3);
		// ���ڸ� ���ڿ��� �ٲٴ� ���� charAt
		System.out.println(ch);

		System.out.println();

		// str�� '��'��� ���ڰ� �ִ��� Ȯ���ϰ� ����ִٸ�
		// �����ϰ� ����, ���ٰ� �����ϰ� ���� ���� ���
		boolean flag = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == '��') {
				flag = true;
				break;

			}
		}
		System.out.println(flag ? "�����ϰ� ����" : "�����ϰ� ���� ����");
		System.out.println();

		String str2 = "Hello Java!!";

		// str2�� char �迭�� ��� �� �迭�� ���
		char chArr[] = new char[str2.length()];
		for (int i = 0; i < str2.length(); i++) {
			chArr[i] = str2.charAt(i);
		}
		for (char ch1 : chArr) {
			System.out.printf("%c", ch1);
		}
	}

}
