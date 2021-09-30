
public class Exam4 {

	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10=55
		// 규칙이 있는 경우 반복문을 사용하는 경우가 많음(증가 혹은 증감)

		int sum = 0, i = 1;
		while (i < 11) { 
			//i를 1로 초기화, 11보다 작은 동안 1씩 증가
			sum = sum + i;
			//합계를 구하기 0+1 = 1 / 1+2 = 3.... 이래서 합계가 나옴
			System.out.print(i);
			//i를 출력
			if (i < 10) { 
			//i가 10보다 작은 동안
			System.out.print("+"); 
			//+를 출력
			} else { System.out.print("="); 
			// =을 출력
		}  i++;
		}
		System.out.print(sum);

}
}
