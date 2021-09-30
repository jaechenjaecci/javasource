import java.util.Scanner;

public class OperatorMain2 {
public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	
	System.out.print("키 : ");
	double height = k.nextDouble();
	
	System.out.print("나이 : ");
	int age = k.nextInt();
	
	System.out.println("----------");
	
	System.out.printf("키 %.1fcm, 나이 %d살\n", height, age);
	// 키가 150cm 이상
	boolean a = (height > 150);
	System.out.println(a);
	
	// 나이가 10살 이하
	boolean b = (age <= 10);
	System.out.println(b);
	
	// 나이가 5살 이상이고, 키가 200cm 이상 
	boolean c = (age >= 5) && (height >= 200);
	System.out.println(c);
	
	//키가 200cm 이상이거나, 나이가 5살 이상
	boolean d = (age >= 5) || (height >=200);
	System.out.println(d);
	
	// 부정
	boolean e = !d;
	System.out.println(e);
	
}
}
