package math;

public class MathEx2 {

	public static void main(String[] args) {
		while(true) {
			
		int num1 =(int)(Math.random()*3)+1;
		int num2 =(int)(Math.random()*3)+1;
		int num3 =(int)(Math.random()*3)+1;
		
		System.out.printf("%d\t%d\t%d\n",num1,num2,num3);
		
		if (num1==num2 && num2==num3) {
			break;
		}
		}
		
		

	}

}
