package ClassText;

// ���� Ÿ�� �޼ҵ��(){} => �⺻����
// void�� �����ϰ� Ÿ�Ը��� ������ ��� ������ retrun ���� �پ����. ������ �� �����°�

public class MethodText1 {
// ���ϰ��� true Ȥ�� false�� ��Ÿ���� �޼ҵ� ����
	boolean isRedirect() {
		return false;
	}

// ���ϰ��� int Ÿ���� �޼ҵ� ����
	int sum() {
		return 3; // int�� �� ���� �ƹ��ų� �������� 3�� ������ ����
	}

// ���Ӱ��� int, �� ���� ��������(�Ѵ� int Ÿ��)�� �ޱ�
	int multiply(int num1, int num2) {
		return num1 * num2;
	}

// ���ϰ� : long, �ΰ��� ��������(int)�� �ޱ�

	long add(long num1, long num2) {
		return num1 + num2;
	}

//���ϰ� : char�� �޼ҵ�
	char method() {
		return 'c'; // char �� �� ���� �ƹ��ų� �������� c�� ������ ����
	}

	void method1() { // ������ ���ʿ�, �ѱ�� ���� ����

	}

//���� Ÿ�� : int 1���� �迭
//�������� : int 1���� �迭
	int[] print(int arr[]) {
		return arr;
	}

//����Ÿ�� : double, �Ű����� : �ΰ��� double
//�޼ҵ尡 �ؾ��� �� : ���� �ΰ��� �Ű������� �������� ��� ����
	double divide(double a, double b) {
		return a/b;
	}
	
	
}
