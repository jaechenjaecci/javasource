import java.util.Scanner;

public class HomeWork {
public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.print("가격 : ");
	int price = k.nextInt();
	System.out.print("지불한 돈 : ");
	int pay = k.nextInt();
	System.out.println(" ---------------- ");
	
	int payback = pay-price;
	System.out.printf("거스름돈 : %d원입니다.\n", payback);
	
	
	if ( payback % 10000 == 0) {
		System.out.printf("1만원권 : %d 입니다.\n", payback/10000);
	} else if (payback % 10000 != 0) {
		System.out.printf("5천원권 : %d 장\n", payback%10000/5000);
	} else if (payback % 10000 != 0) {
		System.out.printf("1천원권 : %d 장\n", payback%10000/1000);
	}
		
	
	
	

	
}
}
