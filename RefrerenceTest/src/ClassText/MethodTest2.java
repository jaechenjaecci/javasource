package ClassText;

public class MethodTest2 {
	//�ΰ��� ���ڸ� �޾Ƽ� ���� ����� �����ֱ�
	
	//�������� �ΰ��� ���ڸ� ����(�Է°�)
	int sum(int num1, int num2) {
		int result = num1+num2;
		return result; // (��°�,��ȯ��)
	// return num1 + num2; ���ٷε� ����
	}


	// �������� 2�ܺ��� 9�ܱ��� ����ϱ�(������X)
	// �Է°� : ����(���� ���� �������), ��ȯ�� : ����(void)
	void print99dan() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i,j,i*j);
			}
		}
	}
	
	// �ΰ��� ������ �޾Ƽ�(�Է°�) ���ϱ� �� ����� ����(��ȯ��)�ϱ�
	int multiply(int x, int y) {
		return x*y;
		
	}
	
	



}
