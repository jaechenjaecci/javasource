import java.util.Scanner;

public class Mission2 {
	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);

		System.out.println(" ----�� �˻� ����---- ");
		System.out.print("�̸� : ");
		String n = A.next();
		System.out.print("Ű(m����) : ");
		double t = A.nextDouble();
		if (t >= 3) { 
			// - 3���� ũ�ٸ� ���ʹ����� ������� �ʴ°����� ����
		} t /= 100; 
		    // - �׷��ٸ� 100���� ������
		
		System.out.print("������ : ");
		double w = A.nextDouble();
		System.out.println(" ------------------ ");

		double x = (w / (t * t));
		System.out.printf("BMI������ %.1f�Դϴ�.\n", x);

//��ü���� �⺻������ �����ϸ� ������ else�� ���� �ʾƵ� ��
	      String result = "��ü��";
	      if(x >= 35) {
	         result= "����";
	      } else if(x >= 30) {
	         result="�ߵ���";
	      } else if(x >=25) {
	         result="�浵��";
	      } else if(x >= 23) {
	         result="��ü��";
	      } else if(x >= 18.5) {
	         result="����";
	      }
	      System.out.printf("%s���� BMI������ %.1f�� %s�Դϴ�.\n", n, x, result);
	}
}
