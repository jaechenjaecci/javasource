import java.util.Scanner;

public class Mission {
public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	
	System.out.println(" ----비만도 검사---- ");
	System.out.print("이름 : ");
	String n = k.next();
	System.out.print("키 : ");
	double t = k.nextDouble();
	System.out.print("몸무게 : ");
	double w = k.nextDouble();
	System.out.println(" ---------------- ");
	
	double x = (t-100) * 0.9;
	System.out.printf("표준체중 : %.2fkg\n", x);
	
	double y = (w / x) * 100; 
	System.out.printf("비만도 : %.2f%%\n", y);
	
	String say = (y > 120) ? "비만": "정상";
	System.out.printf("%s씨는 %s입니다.\n",n,say);
	
	System.out.println("끄고 싶으면 뭐라도 쳐요.");
	String text = k.next();
	
	
}
}
