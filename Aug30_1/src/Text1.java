import java.util.Scanner;

public class Text1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in) ;
				
		System.out.println(" ---편의점택배--- ");
		
		System.out.print("가로 :");
		// 소수점도 쓰려면 double 사용하면 됨, int 했더니 오류남 더블쓰셈
		double w = k.nextDouble();
		
		System.out.print("세로 :");
		double h = k.nextDouble();
		
		System.out.print("높이 :");
		double y = k.nextDouble();
	
		System.out.print("무게 :");
		double weight = k.nextDouble();
		
		
		System.out.println(" ------------ ");
		
		double v = w*h*y;
		System.out.printf("부피 : %.1fcm\n", v);
		System.out.printf("무게 : %.1fkg\n", weight);
	
		boolean a = (v >= 10 ) && (weight >= 1000);
		System.out.println(a);
		
		boolean b = (v < 10 ) || (weight < 1000);
		System.out.println(b);
		
		boolean c = (weight >= 20 ) && (weight >= 30);
		System.out.println(c);
		
		boolean d = (v <10 ) ^ (weight < 1000);
		System.out.println(d);
		
		// 다중선택문항에서 사용함
		//int a = 3<<2;
		//System.out.println(a);
		
		
		
		
		
		
		
		
	
	}

}
