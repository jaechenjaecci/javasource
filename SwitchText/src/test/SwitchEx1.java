package test;

// switch(int, double, float, String, enum){
// case �� 1:
// 		�ؾ��� ��:
//		break;
//}
public class SwitchEx1 {

	public static void main(String[] args) {
		// �ֻ���
		// 1-6 ������ ���� �ڵ����� �������ִ� ��
		// random 0.0 <= � �� < 1.0
		int num = (int) (Math.random() * 6) + 1;
		// 0-5�� ������ ������ 1�� ���ؼ� 6���� ���� �� �ֵ��� ��
		// 0.99*6=5.94 (6�� �ȳ���)
		// System.out.println(num);

		// if (num==1) {
		// System.out.println("1�� ����");
		// } else if (num==2) {
		// System.out.println("2�� ����");
		// } else if (num==3) {
		// System.out.println("3�� ����");
		// } else if (num==4) {
		// System.out.println("4�� ����");
		// } else if (num==5) {
		// system.out.println("5�� ����");
		// } else {
		// System.out.println("6�� ����");
		// }
		switch (num) {
		case 1: //num�� 1�� ���ٸ� ��� ��
			System.out.println("1�� ����");
			break; //���� �������� �Ѿ�� �ʵ��� ���ִ� �ǹ�
		case 2:
			System.out.println("2�� ����");
			break;
		case 3:
			System.out.println("3�� ����");
			break;
		case 4:
			System.out.println("4�� ����");
			break;
		case 5:
			System.out.println("5�� ����");
			break;
		default:
			System.out.println("6�� ����");
		}

	}

}
