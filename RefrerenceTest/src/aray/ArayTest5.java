package aray;

public class ArayTest5 {

	public static void main(String[] args) {
		// ���� => �ϳ��� �ǹ� (char, 'A', ���� ����ǥ�� �̿��� ǥ��)
		// ���ڿ� => �������� �ǹ� (String, "ABC", ū ����ǥ�� �̿��� ǥ��)
		// char �迭 ����, ����, �ʱ�ȭ
		
		char chArr[] = {'a', 'n','s','w','e','r'};
	//	char[] chArr = {'a', 'n','s','w','e','r'};  �밡���� ��ġ�� �� �� ���� �־ ��� ����
		char chArr2[] = {'a', 'n','s','w','e','r'};
		
		for(char ch :chArr) {
			System.out.print(ch);
		}
	}

}
