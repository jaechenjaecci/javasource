package ClassText;

public class NumbersEx {

	public static void main(String[] args) {
		// 호출 시 생성자를 넣는다
		int num[] = { 5, 6, 7, 8, 9 };
		Numbers numbers = new Numbers(num);
		System.out.println("합계 : " + numbers.getTotal());
		System.out.println("평균 : " + numbers.getAverage());
	}

}
