import java.util.Scanner;

public class Mission2 {
	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);

		System.out.println(" ----비만 검사 센터---- ");
		System.out.print("이름 : ");
		String n = A.next();
		System.out.print("키(m단위) : ");
		double t = A.nextDouble();
		if (t >= 3) { 
			// - 3보다 크다면 미터단위를 사용하지 않는것으로 간주
		} t /= 100; 
		    // - 그렇다면 100으로 나눠줌
		
		System.out.print("몸무게 : ");
		double w = A.nextDouble();
		System.out.println(" ------------------ ");

		double x = (w / (t * t));
		System.out.printf("BMI지수는 %.1f입니다.\n", x);

//저체중을 기본값으로 설정하면 마지막 else를 쓰지 않아도 됨
	      String result = "저체중";
	      if(x >= 35) {
	         result= "고도비만";
	      } else if(x >= 30) {
	         result="중도비만";
	      } else if(x >=25) {
	         result="경도비만";
	      } else if(x >= 23) {
	         result="과체중";
	      } else if(x >= 18.5) {
	         result="정상";
	      }
	      System.out.printf("%s님은 BMI지수가 %.1f로 %s입니다.\n", n, x, result);
	}
}
