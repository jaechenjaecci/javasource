package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();

		set1.add("java");
		set1.add("jsp");
		set1.add("oracle");
		set1.add("html");

		System.out.println(set1);
// 순서가 없기 때문에 담은 순서대로 나오지 않음
		
		for(String str : set1) {
			System.out.println(str);
		}
		
		System.out.println();
		
		set2.add("1");
		set2.add("2");
		set2.add("3");
		set2.add("4");
		set2.add("1");
		
		System.out.println(set2);
		// 중복된 것은 출력되지 않음, 알아서 제외 시킴

	}
}
