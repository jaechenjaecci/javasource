package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
	 List<Member> List = new ArrayList<>();
	 
	 List.add(new Member("hong", "hong1234", "ȫ�浿"));
	 List.add(new Member("hong", "hong12345", "��浿"));
	 List.add(new Member("hong", "hong12346", "�ֱ浿"));
	 List.add(new Member("hong", "hong12347", "��浿"));
	 List.add(new Member("hong", "hong12348", "�ڱ浿"));
	 
	 System.out.println(List);
	 
	 System.out.println();
	 
	 for(Member member : List) {
		 System.out.println(member);
	 }
	 
	
	 
	}

}
