import java.util.Scanner;

public class CSMain {
	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);

		System.out.print("가격 :");
		int price = A.nextInt();

		System.out.println("---------------");
		System.out.printf("%d원어치 구매\n", price);

		int point = price / 100;

		if (price >= 10000) {
			point += 50;
		}

		if ( price > 20000 && price < 50000) {
			point += 100;
			
			}else {
				point += 10;
		}
		

		System.out.printf("적립포인트 : %s입니다. \n", point);

	}
}
