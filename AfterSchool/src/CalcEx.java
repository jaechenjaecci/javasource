import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		System.out.print("������ �Է� : ");
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
