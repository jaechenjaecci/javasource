package system;
// 시간을 재는 프로그램
public class SystemEx2 {
	public static void main(String[] args) {
		long sum = 0;

		long start = System.currentTimeMillis();

		for (int i = 1; i < 1000000000; i++) {
			sum += i;
		}
		long end = System.currentTimeMillis();
		System.out.println("1 ~ 10,000,000 걸린 시간" + (end - start));
		System.out.println("1 ~ 10,000,000 합" + (sum));
	}
}
