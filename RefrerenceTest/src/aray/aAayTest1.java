package aray;

public class aAayTest1 {

	public static void main(String[] args) {
	//int 타입의 변수 10개 생성
	//int a=1,b=2,c=3.... 일일히 설정하기엔 너무나 번거로움  
	//=> 배열을 만들게 됨 : 배열은 참조타입
	
	int arr[]=new int[10]; //기본형
	
	arr[3] = 90;
	arr[5] = 80;
	arr[7] = 70;
	arr[9] = 60;
	
	System.out.println(arr[0]);
	System.out.println(arr[3]);
	
	for (int i = 0; i <10; i++) {
		System.out.println(arr[i]);
	}
	
	}
	

}
