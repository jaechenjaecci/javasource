import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력 : ");
		String oper = sc.next();

		Calc calc = null;

		switch (oper) {
		case "+":
			calc = new Add();
			break;
		case "-":
			calc = new Sub();
			break;
		case "*":
			calc = new Mul();
			break;
		case "/":
			calc = new Div();
			break;

		}
		calc.setValue(num1, num2);

		System.out.println(calc.calculate());

	}

}
