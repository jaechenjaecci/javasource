import java.util.Scanner;

public class Text1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in) ;
				
		System.out.println(" ---�������ù�--- ");
		
		System.out.print("���� :");
		// �Ҽ����� ������ double ����ϸ� ��, int �ߴ��� ������ ������
		double w = k.nextDouble();
		
		System.out.print("���� :");
		double h = k.nextDouble();
		
		System.out.print("���� :");
		double y = k.nextDouble();
	
		System.out.print("���� :");
		double weight = k.nextDouble();
		
		
		System.out.println(" ------------ ");
		
		double v = w*h*y;
		System.out.printf("���� : %.1fcm\n", v);
		System.out.printf("���� : %.1fkg\n", weight);
	
		boolean a = (v >= 10 ) && (weight >= 1000);
		System.out.println(a);
		
		boolean b = (v < 10 ) || (weight < 1000);
		System.out.println(b);
		
		boolean c = (weight >= 20 ) && (weight >= 30);
		System.out.println(c);
		
		boolean d = (v <10 ) ^ (weight < 1000);
		System.out.println(d);
		
		// ���߼��ù��׿��� �����
		//int a = 3<<2;
		//System.out.println(a);
		
		
		
		
		
		
		
		
	
	}

}
