package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		List<String> List1 = new ArrayList<String>();
		ArrayList<Integer> List2 = new ArrayList<Integer>();
		// E,T,K,V ����� ���� ��ü Ÿ���� �����϶�� ��
		// ���� ������ ��ü Ÿ���� ���� �����ؾ���, ���ڸ��� �׻� �빮�ڷ� ���;���
		List1.add("���");
		List1.add("��");
		List1.add("������");
		List1.add("����");
		List1.add("����");
		List1.add("�ٳ���");

		for (String str : List1) {
			System.out.println(str);

		}
		System.out.println();

		System.out.println(List1);
		// toString�� �������̵� �Ǿ� �־ ����Ʈ�� �ִ�
		// ������ ��µ�

		System.out.println();

		for (int i = 0; i < List1.size(); i++) {
			System.out.println(List1.get(i));
		}
		System.out.println();

		List2.add(10);
		List2.add(20);
		List2.add(30);
		List2.add(40);
		List2.add(50);
		List2.add(60);

		for (Integer i : List2) {
			System.out.println(i);
		}

		int sum = 0;
		for (Integer i : List2) {
			sum += i;
		}
		System.out.println("�հ�" + sum);
	}
}
