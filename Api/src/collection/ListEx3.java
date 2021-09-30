package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
	 List<Member> List = new ArrayList<>();
	 
	 List.add(new Member("hong", "hong1234", "홍길동"));
	 List.add(new Member("hong", "hong12345", "장길동"));
	 List.add(new Member("hong", "hong12346", "최길동"));
	 List.add(new Member("hong", "hong12347", "김길동"));
	 List.add(new Member("hong", "hong12348", "박길동"));
	 
	 System.out.println(List);
	 
	 System.out.println();
	 
	 for(Member member : List) {
		 System.out.println(member);
	 }
	 
	
	 
	}

}
