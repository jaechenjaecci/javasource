import java.util.Scanner;

public class Text2 {
public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	
	
	System.out.println("�̸� : ");
	String name = k.next();
	
	System.out.println("���� : ");
	int age = k.nextInt();
	
	String say1 = (name.equals("ȫ�浿")) ? "�ݰ��� ģ����" : "ó���˰ڽ��ϴ�.";
	System.out.println(say1);
	
	String say = (age >= 20) ? "�������!": "�̼����� �ȹ޾ƿ�.";
	System.out.println(say);
	
	String e = (age % 2 == 0 )  ? "¦��": "Ȧ��";
	System.out.println(e);
	
		
}
}