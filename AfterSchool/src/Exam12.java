
public class Exam12 {

	public static void main(String[] args) {
		String arr[] = { "사과", "배", "수박", "참외", "딸기", "포도", "체리" };

		for (String str : arr) {
			System.out.print(str + " ");

		}
		System.out.println();

		double arr2[] = { 56.3, 28, 45.6, 18.7, 14.9 };
		//정수인 숫자들이 더블로 형변환이 일어남
		for (double dou : arr2) {
			System.out.print(dou + " ");
		}
	}
}