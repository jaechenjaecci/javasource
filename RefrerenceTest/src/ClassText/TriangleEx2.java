package ClassText;

public class TriangleEx2 {

	public static void main(String[] args) {
		// 첫번째 삼각형
		// 기본생성자를 호출하면서 객체를 생성함
		Triangle2 triangle1 = new Triangle2(15,30);
		//triangle1.height = 15;
		//triangle1.width = 30;
		System.out.println("삼각형의 넓이: "+triangle1.area());
		                               
		
		
		//두번째 삼각형
		Triangle2 triangle2 = new Triangle2(17,24);
		//triangle1.height = 17;
		//triangle1.width = 24;
		System.out.println("삼각형의 넓이: "+triangle2.area());
		
		
		
		
	}

}
