import java.util.Scanner;

public class HomeWork {
public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.print("���� : ");
	int price = k.nextInt();
	System.out.print("������ �� : ");
	int pay = k.nextInt();
	System.out.println(" ---------------- ");
	
	int payback = pay-price;
	System.out.printf("�Ž����� : %d���Դϴ�.\n", payback);
	
	
	if ( payback % 10000 == 0) {
		System.out.printf("1������ : %d �Դϴ�.\n", payback/10000);
	} else if (payback % 10000 != 0) {
		System.out.printf("5õ���� : %d ��\n", payback%10000/5000);
	} else if (payback % 10000 != 0) {
		System.out.printf("1õ���� : %d ��\n", payback%10000/1000);
	}
		
	
	
	

	
}
}
