package arrays;

import java.util.Arrays;

public class ArraysEx3 {
	public static void main(String[] args) {
		int arr3[] = { 32, 54, 56, 76, 87, 65, 45, 43, 23 };
		// 54 숫자가 몇 번째에 있는 지 조회

		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] == 54) {
				System.out.println(i + 1 + "번째 찾았음");
				break;
			}
		}
	System.out.println();
	//binarySearch : 이진검색(정렬을 먼저 한 후)
	Arrays.sort(arr3);
	
	int pos = Arrays.binarySearch(arr3, 54);
	System.out.println(pos + 1 + "번째 찾았음");
	
	}
}
