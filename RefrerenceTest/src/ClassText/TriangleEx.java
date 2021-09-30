package ClassText;

public class TriangleEx {

	public static void main(String[] args) {
		// 첫번째 삼각형
		Triangle triangle1 = new Triangle();
		triangle1.height = 15;
		triangle1.width = 30;
		System.out.println("삼각형의 넓이: "+triangle1.area());
		                                //메소드 호출
		
		
		//두번째 삼각형
		Triangle triangle2 = new Triangle();
		triangle1.height = 17;
		triangle1.width = 24;
		System.out.println("삼각형의 넓이: "+triangle2.area());
		
		
		
		
	}

}
