
public class Exam3 {

	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10=55
		// ��Ģ�� �ִ� ��� �ݺ����� ����ϴ� ��찡 ����(���� Ȥ�� ����)

		int sum = 0;
		for (int i = 1; i < 11; i++) { 
			//i�� 1�� �ʱ�ȭ, 11���� ���� ���� 1�� ����
			sum = sum + i;
			//�հ踦 ���ϱ� 0+1 = 1 / 1+2 = 3.... �̷��� �հ谡 ����
			System.out.print(i);
			//i�� ���
			if (i < 10) { 
			//i�� 10���� ���� ����
			System.out.print("+"); 
			//+�� ���
			} else System.out.print("="); 
			// =�� ���
		}   //�հ踦 ���
		System.out.print(sum);
		}

}
