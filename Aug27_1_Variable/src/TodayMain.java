import java.util.Scanner;

public class TodayMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("�Ĵ� �̸� : ");
		String name = k.next();
		
		System.out.print("�Ĵ� ũ�� : ");
		double size = k.nextDouble();
		
		System.out.print("���̺� �� : ");
		int table = k.nextInt();
		
		System.out.print("�������ΰ� : ");
		boolean isopen = k.nextBoolean();
		
		k.close();
		
		System.out.println("************");
		System.out.println(name);
		System.out.println(size);
		System.out.println(table);
		System.out.println(isopen);
		System.out.println("************");
		
		
	}
	}

