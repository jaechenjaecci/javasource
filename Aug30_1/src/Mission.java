import java.util.Scanner;

public class Mission {
public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	
	System.out.println(" ----�񸸵� �˻�---- ");
	System.out.print("�̸� : ");
	String n = k.next();
	System.out.print("Ű : ");
	double t = k.nextDouble();
	System.out.print("������ : ");
	double w = k.nextDouble();
	System.out.println(" ---------------- ");
	
	double x = (t-100) * 0.9;
	System.out.printf("ǥ��ü�� : %.2fkg\n", x);
	
	double y = (w / x) * 100; 
	System.out.printf("�񸸵� : %.2f%%\n", y);
	
	String say = (y > 120) ? "��": "����";
	System.out.printf("%s���� %s�Դϴ�.\n",n,say);
	
	System.out.println("���� ������ ���� �Ŀ�.");
	String text = k.next();
	
	
}
}
