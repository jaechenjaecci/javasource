
public class Exam11 {

	public static void main(String[] args) {
		// 배열 => 힙(new)
		// 배열선언
		int arr[]; 
		// 생성
		arr = new int[10];		
		// 초기화
		for (int i = 0; i<arr.length; i++) {
		arr[i] = i+1;
		// i에 1씩 더해줘야지 기존에 담겨있던 0이 출력되는 것이 아니라
		// 1에서 1씩 증가한 숫자가 저장되고, 출력됨 
			
		System.out.print(arr[i]+" ");
		}
		// 사용
System.out.println();
	
	for (int j:arr) {
		// 뒤에는 무조건 배열명
		// arr에서 차례로 하나를 꺼내니까 자료형은 int고,
		// 그 뒤는 원하는 변수명을 작성
		// 인덱스를 작성하지 않아서 편리함
		// arr이라는 배열에서, 하나씩 꺼내서 j에 담아달라는 명령임
		
		
		System.out.print(j+" ");
	
	
	
	
	
	
	
	
	
	}
	}

}
