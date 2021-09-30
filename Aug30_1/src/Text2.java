import java.util.Scanner;

public class Text2 {
public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	
	
	System.out.println("이름 : ");
	String name = k.next();
	
	System.out.println("나이 : ");
	int age = k.nextInt();
	
	String say1 = (name.equals("홍길동")) ? "반갑다 친구야" : "처음뵙겠습니다.";
	System.out.println(say1);
	
	String say = (age >= 20) ? "어서오세요!": "미성년자 안받아요.";
	System.out.println(say);
	
	String e = (age % 2 == 0 )  ? "짝수": "홀수";
	System.out.println(e);
	
		
}
}