package ClassText;

public class Numbers {
	private int num[];

	public Numbers(int[] num) {
		super();
		// {5,6,7,8,9}
		this.num = num;
	}

// �հ� = ��ȯ���� int, �Է°��� ����
//   =>������� num �迭�� ����ִ� ���� �հ踦 ����

	int getTotal() {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		// ������ �ǹ̴� ���� ȣ���� ������ ���ư���� �ǹ�
		return sum;
	}
// ��� = ��ȯ���� double, �Է°��� ����
//    => �հ� �޼ҵ带 �̿��ؼ� ����� ���� �� ����

	double getAverage() {
		return (double)getTotal() / num.length;
	}

}
