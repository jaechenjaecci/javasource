import java.util.Scanner;

public class OperatorMain {
public static void main(String[] args) {
Scanner k = new Scanner(System.in);
	
	System.out.print("X : ");
	int xx = k.nextInt();
	
	System.out.print("Y : ");
	int yy = k.nextInt();
	
	System.out.println("-----------");
	System.out.printf("X는 %d, Y는 %d\n", xx,yy);
	
	
	String laugh = "ㅋ";
	int a = xx+yy;	
	String aa = xx+laugh;
	
	int b = xx-yy;
	int c = xx*yy;
	
	double d = xx/yy;
	double dd = xx/(double)yy;
	int e = xx%yy;
	
	System.out.println(a);
	System.out.println(aa);
	System.out.println("차는" + b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(dd);
	System.out.println(e);
	System.out.println("----------");
	
	// xx = xx+5;
	xx += 5;
	System.out.println(xx);
	
	
	
	
	
}
}
