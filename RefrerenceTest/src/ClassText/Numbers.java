package ClassText;

public class Numbers {
	private int num[];

	public Numbers(int[] num) {
		super();
		// {5,6,7,8,9}
		this.num = num;
	}

// 합계 = 반환값은 int, 입력값은 없음
//   =>멤버변수 num 배열에 들어있는 값의 합계를 리턴

	int getTotal() {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		// 리턴의 의미는 나를 호출한 곳으로 돌아가라는 의미
		return sum;
	}
// 평균 = 반환값은 double, 입력값은 없음
//    => 합계 메소드를 이용해서 평균을 구한 후 리턴

	double getAverage() {
		return (double)getTotal() / num.length;
	}

}
