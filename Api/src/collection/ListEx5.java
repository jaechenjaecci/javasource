package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx5 {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>(20000000);
		List<String> LinkedList = new LinkedList<String>();

		System.out.println("****** ������ �߰� *****");
		System.out.println("ArrayList �ɸ� �ð� : " + add1(arrayList) + "ms");
		System.out.println("LinendList �ɸ� �ð� : " + add1(LinkedList) + "ms");
		
		System.out.println();
		
		System.out.println("****** �߰����� �߰� *****");
		System.out.println("ArrayList �ɸ� �ð� : " + add2(arrayList) + "ms");
		System.out.println("LinedList �ɸ� �ð� : " + add2(LinkedList) + "ms");
	
		System.out.println();
		
		System.out.println("****** �߰����� ���� *****");
		System.out.println("ArrayList �ɸ� �ð� : " + remove1(arrayList) + "ms");
		System.out.println("LinedList �ɸ� �ð� : " + remove1(LinkedList) + "ms");
	
		System.out.println();
		
		System.out.println("****** ���������� ���� *****");
		System.out.println("ArrayList �ɸ� �ð� : " + remove2(arrayList) + "ms");
		System.out.println("LinedList �ɸ� �ð� : " + remove2(LinkedList) + "ms");
	
	}

	// �������� �߰�
	public static long add1(List<String> List) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			List.add(i + "");
			//String���� �ֱ⵵ �߱� ������ �׳� i�� ������ int���� �ְ� �Ǳ� ������
			//""�� �߰�����
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	// �߰����� �߰�
	public static long add2(List<String> List) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			//������ �����µ� 500�� �ڸ����� X�� �߰��ϱ�
			List.add(500 + "X");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	// �߰����� ����
	public static long remove1(List<String> List) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			List.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long remove2(List<String> List) {
		long start = System.currentTimeMillis();
		for (int i = List.size() - 1; i >= 0; i--) {
			List.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;

	}

}
