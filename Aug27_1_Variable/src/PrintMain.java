import java.util.Scanner;

public class PrintMain {
public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	
	System.out.print("��ǰ�� : ");
	String name = k.next();
	
	System.out.print("���� : ");
	int price = k.nextInt();
	
	System.out.print("���� : ");
	double weight = k.nextDouble();
	
	System.out.println("-------------");
	
	System.out.printf("��ǰ�� : %s\n",name);
	System.out.printf("���� : %d\n",price);
	System.out.printf("���� : %s\n",weight);
	
}
}
