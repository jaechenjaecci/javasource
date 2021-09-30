import java.util.Scanner;

public class PrintMain {
public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	
	System.out.print("제품명 : ");
	String name = k.next();
	
	System.out.print("가격 : ");
	int price = k.nextInt();
	
	System.out.print("무게 : ");
	double weight = k.nextDouble();
	
	System.out.println("-------------");
	
	System.out.printf("제품명 : %s\n",name);
	System.out.printf("가격 : %d\n",price);
	System.out.printf("무게 : %s\n",weight);
	
}
}
