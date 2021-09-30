package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx5 {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>(20000000);
		List<String> LinkedList = new LinkedList<String>();

		System.out.println("****** 순차적 추가 *****");
		System.out.println("ArrayList 걸린 시간 : " + add1(arrayList) + "ms");
		System.out.println("LinendList 걸린 시간 : " + add1(LinkedList) + "ms");
		
		System.out.println();
		
		System.out.println("****** 중간에서 추가 *****");
		System.out.println("ArrayList 걸린 시간 : " + add2(arrayList) + "ms");
		System.out.println("LinedList 걸린 시간 : " + add2(LinkedList) + "ms");
	
		System.out.println();
		
		System.out.println("****** 중간에서 삭제 *****");
		System.out.println("ArrayList 걸린 시간 : " + remove1(arrayList) + "ms");
		System.out.println("LinedList 걸린 시간 : " + remove1(LinkedList) + "ms");
	
		System.out.println();
		
		System.out.println("****** 순차적으로 삭제 *****");
		System.out.println("ArrayList 걸린 시간 : " + remove2(arrayList) + "ms");
		System.out.println("LinedList 걸린 시간 : " + remove2(LinkedList) + "ms");
	
	}

	// 순차적인 추가
	public static long add1(List<String> List) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			List.add(i + "");
			//String값을 넣기도 했기 때문에 그냥 i만 넣으면 int값을 넣게 되기 때문에
			//""를 추가해줌
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	// 중간에서 추가
	public static long add2(List<String> List) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			//만번을 돌리는데 500번 자리마다 X를 추가하기
			List.add(500 + "X");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	// 중간에서 삭제
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
