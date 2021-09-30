import java.util.Scanner;

public class TodayMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("식당 이름 : ");
		String name = k.next();
		
		System.out.print("식당 크기 : ");
		double size = k.nextDouble();
		
		System.out.print("테이블 수 : ");
		int table = k.nextInt();
		
		System.out.print("영업중인가 : ");
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

