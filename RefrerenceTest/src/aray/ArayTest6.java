package aray;

public class ArayTest6 {

	public static void main(String[] args) {
		// 이차원 배열
		int scores[][] = new int[2][3]; // 2행3열 생성
		
		//초기화
		scores[0][0] = 15;
		scores[0][1] = 25;
		scores[0][2] = 35;
		
		scores[1][0] = 45;
		scores[1][1] = 55;
		scores[1][2] = 65;
		
		//확인
		System.out.println("배열 길이(행) : " +scores.length); //행의 길이 출력됨 (세로 칸의 개수)
		System.out.println("배열 길이(열) : " +scores[0].length); //열의 길이 출력됨(가로 칸의 개수)
		
	      for(int i=0; i<scores.length; i++) {
	          for(int j=0; j<scores[i].length; j++) {
	             System.out.print(scores[i][j]+"  ");
	          }
	          System.out.println();
	       }
	       
	       System.out.println();

	       // 향상된 for문
	       for(int score[] : scores) { // 가지고 나오는 자체가 1차원 배열이기때문에 임의로 정한 변수(왼쪽)가 배열로 정의된다.
	          for(int j : score) {
	             System.out.print(j+"  ");
	          }
	          System.out.println();
	       }
	       System.out.println();
	       
	       
	       int arr[][] = {
	             {15, 25},
	             {65, 85, 95}
	       }; // 2행이지만 열의 갯수가 다르다.
	       
	       // 향상된 for문
	       for(int i[] : arr) { 
	          for(int j : i) {
	             System.out.print(j+"  ");
	          }
	          System.out.println();
	       }
	       
	       System.out.println();
	       
	       // 배열 이름만 출력
	       System.out.println(scores); // 결과 : [[I@2a139a55
	       System.out.println(arr); // 결과 : [[I@15db9742
	       // 이상한 값이 출력된다.
	       /*
	        * 배열의 이름을 찍어내면 나오는 이상한 값은 주소값이다.(stack영역에 저장)
	        * 이 주소를 따라 가보면 실제 값이 저장되어있다.(실제 값이 저장된 곳은 heap영역) 
	        *  
	        */

	
}
}


