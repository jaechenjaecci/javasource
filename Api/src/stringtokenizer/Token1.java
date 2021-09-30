package stringtokenizer;

import java.util.StringTokenizer;

public class Token1 {
	public static void main(String[] args) {
		String text = "ȫ�浿/������/�ڿ���/�̼�ȫ";
		
		String[] names = text.split("/");
		//��ũ������ ���� ����� ����
		for (String s:names) {
			System.out.println(s);
		}
		System.out.println();
		
		//�������� ��ū���� ���еǾ� �ִ� ���, �������ε� ������
		String text1 = "ȫ�浿 ������ �ڿ��� �̼�ȫ";
		names = text1.split(" ");
		for (String s:names) {
			System.out.println(s);
		}
		
		System.out.println();
		
		StringTokenizer st = 
				new StringTokenizer(text, "/");
		//��ū���� �ؽ�Ʈ�� �Ѱ��ְ� �����ø� �������� �и�
		//�����÷� �и��Ǿ� ������ ���ڸ� ��ū�̶�� ��
		while(st.hasMoreTokens()) {
		//��ū�� ������ �ִٸ�	
			System.out.println(st.nextToken());
		//���� ��ū�� ��������� ��
		}

	}

}
