import java.util.Scanner;
public abstract class Converter {
	
abstract protected double convert(double src);

//������
abstract protected String getSrcString();
abstract protected String getDestString();
protected double ratio;

//�޼ҵ�
public void run() {
	Scanner scanner = new Scanner(System.in);
	System.out.println(getSrcString()+"��"+getDestString()+"�� �ٲߴϴ�.");
	System.out.print(getSrcString()+"�� �Է��ϼ���>>");
	
	double val = scanner.nextDouble();
	double res = convert(val);
	//val�� Ű����� �Է¹��� ��, res�� �Է¹��� ���� ��ȯ�� ��
	
	System.out.println("��ȯ ��� : "+res+getDestString()+"�Դϴ�.");
	scanner.close();
}

}
