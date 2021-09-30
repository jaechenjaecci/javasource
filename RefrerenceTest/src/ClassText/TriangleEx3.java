package ClassText;

public class TriangleEx3 {

	public static void main(String[] args) {
	// 길이가 서로 다은 삼각형 5개를 가지고 있음
	// 삼각형의 넓이 구하기
		
		Triangle3 triArr[] = new Triangle3[5]; 
		triArr[0] = new Triangle3(15,16);
		triArr[1] = new Triangle3(16,15);
		triArr[2] = new Triangle3(17,14);
		triArr[3] = new Triangle3(18,13);
		triArr[4] = new Triangle3(19,12);
		
		printArr(triArr);	
	}

	static void printArr(Triangle3 triArr[]) { 
			for (int i = 0; i < triArr.length; i++) {
			System.out.println("삼각형의 넚이 :" + triArr[i].area());	
			

	
			}
			}
}
