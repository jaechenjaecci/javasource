package collection;

import java.util.ArrayList;
import java.util.Comparator;

public class ListEx2 {
public static void main(String[] args) {
	ArrayList<String> List = new ArrayList<String>();
	
	List.add("java");
	List.add("JDBC");
	List.add("Servlet");
	List.add("jsp");
	List.add("java");
	
	System.out.println(List);
	
	// 몇 번 자리에 추가 가능
	List.add(2, "oracle");
	System.out.println(List);
	
	//삭제
	List.remove(1);
	System.out.println(List);
	
	//정렬
	List.sort(Comparator.reverseOrder());
	//내림차순으로 나옴, 오름차순은 naturalOrder
	System.out.println(List);
	
}
}
