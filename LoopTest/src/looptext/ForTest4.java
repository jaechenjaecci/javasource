package looptext;

import java.util.Scanner;

public class ForTest4 {
public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.print("�ܼ��� �Է��ϼ���. : ");
	int level = k.nextInt();
	
	for (int i = 1; i <10; i++) {
		System.out.printf("%d * %d = %d\t",level,i,(level*i));
	}
	
}
}
