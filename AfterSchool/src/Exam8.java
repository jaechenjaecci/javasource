
public class Exam8 {

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

	}

}
