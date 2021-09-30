package arrays;

import java.util.Arrays;

public class ArraysEx1 {
public static void main(String[] args) {
	int[] arr = {0,1,2,3,4};
	int[][] arr2 = {{11,12,13},{21,22,23}};
	
	System.out.println(Arrays.toString(arr));
	//일차원 배열은 해결
	System.out.println(Arrays.deepToString(arr2));
	//이차원 배열 출력 가능
	
}
}
