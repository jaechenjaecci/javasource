package arrays;

import java.util.Arrays;

public class ArraysEx3 {
	public static void main(String[] args) {
		int arr3[] = { 32, 54, 56, 76, 87, 65, 45, 43, 23 };
		// 54 ���ڰ� �� ��°�� �ִ� �� ��ȸ

		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] == 54) {
				System.out.println(i + 1 + "��° ã����");
				break;
			}
		}
	System.out.println();
	//binarySearch : �����˻�(������ ���� �� ��)
	Arrays.sort(arr3);
	
	int pos = Arrays.binarySearch(arr3, 54);
	System.out.println(pos + 1 + "��° ã����");
	
	}
}
