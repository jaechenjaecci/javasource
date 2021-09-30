package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		List<String> List1 = new ArrayList<String>();
		ArrayList<Integer> List2 = new ArrayList<Integer>();
		// E,T,K,V 등등은 담을 객체 타입을 지정하라는 뜻
		// 왼쪽 오른쪽 객체 타입은 같게 설정해야함, 앞자리가 항상 대문자로 들어와야함
		List1.add("사과");
		List1.add("배");
		List1.add("복숭아");
		List1.add("딸기");
		List1.add("수박");
		List1.add("바나나");

		for (String str : List1) {
			System.out.println(str);

		}
		System.out.println();

		System.out.println(List1);
		// toString이 오버라이딩 되어 있어서 리스트에 있는
		// 값들이 출력됨

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
		System.out.println("합계" + sum);
	}
}
