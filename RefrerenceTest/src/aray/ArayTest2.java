package aray;

public class ArayTest2 {

	public static void main(String[] args) {
		//int 타입의 변수 10개 선언
		//담으려고 하는 타입 배열명[] = new 담으려고 하는 타입[개수]
		
		
		// 배열의 선언과 생성 : 힙에 들어가는 종류는 생성이라고 칭함
		int scores[] = new int[10];
		
		//int arr[]; //선언     + arr = new int[10]; //생성
		//코드에 따라 선언과 생성을 나눠서 하는 경우도 있음
		
		//배열의 선언과 생성 및 초기화 : 사용자에게 입력을 받지 않는 경우 바로 초기화를 해도 됨
		//간편해서 가장 많이 사용하는 방식임
		//때에 따라 위에 방법대로 나눠서 하는 경우도 있음
		int arr2[]= {35,36,37,38,39};
		System.out.println("배열 길이 : "+arr2.length);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
	
	
	
	
	}

}
