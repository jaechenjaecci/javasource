import java.util.Scanner;

public class OperatorMain2 {
public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	
	System.out.print("Ű : ");
	double height = k.nextDouble();
	
	System.out.print("���� : ");
	int age = k.nextInt();
	
	System.out.println("----------");
	
	System.out.printf("Ű %.1fcm, ���� %d��\n", height, age);
	// Ű�� 150cm �̻�
	boolean a = (height > 150);
	System.out.println(a);
	
	// ���̰� 10�� ����
	boolean b = (age <= 10);
	System.out.println(b);
	
	// ���̰� 5�� �̻��̰�, Ű�� 200cm �̻� 
	boolean c = (age >= 5) && (height >= 200);
	System.out.println(c);
	
	//Ű�� 200cm �̻��̰ų�, ���̰� 5�� �̻�
	boolean d = (age >= 5) || (height >=200);
	System.out.println(d);
	
	// ����
	boolean e = !d;
	System.out.println(e);
	
}
}
