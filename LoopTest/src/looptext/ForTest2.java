package looptext;

public class ForTest2 {
	public static void main(String[] args) {
		int sum = 0; // sum�� main�� ���ᰡ �Ǿ�� ����
		for (int i = 1; i < 11; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		System.out.println();

		sum = 0; //�۾� �� �ʱ�ȭ
		for (int i = 1; i < 101; i++) {
			sum = sum + i;
		}
		System.out.println("1~100������ �� : "+sum);
	}
}
