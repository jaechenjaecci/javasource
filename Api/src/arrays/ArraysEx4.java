package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEx4 {
public static void main(String[] args) {
	
	List<String> list =Arrays.asList("apple","���","Lemon");
	// list�� ũ�⸦ ������ �� ����
	
	List<Integer> list2 =new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	list2.add(6);
	System.out.println(list2);
}
}
