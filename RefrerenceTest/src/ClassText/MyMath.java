package ClassText;

public class MyMath {
//�������-long Ÿ�� ���� 2�� ����
//�޼ҵ�: add,subtract,multiply,divide	
//�Է� ���� ����, ��°� ������
	
long a,b;

long add() {
	return a+b;
}
long subtrack() {
	return a-b;
}
long multiply() {
	return a*b;
}
double divide() {
	return a/b;
}
	

static long add(long a, long b) {
// static�� �����س����� ���� static ������ �� �� �ֱ� ������ 
// �� ���� �ִ� long a,b�� ����� �� ����
// �׷��� �ݵ�� ���ξȿ� �޾���� ��, ���� �ִ� a,b�� �ٸ� ������
// �޼ҵ� �ȿ����� ����� �� �ִ� ������ ����������� ��
	
	return a+b;
}
static long subtrack(long a, long b) {
	return a-b;
}
static long multiply(long a, long b) {
	return a*b;
}
static double divide(double a, long b) {
	return a/b;
}
		
	
	
	
}
