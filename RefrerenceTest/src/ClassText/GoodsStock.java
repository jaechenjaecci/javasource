package ClassText;

public class GoodsStock {
// �Ӽ� : ��ǰ�ڵ�(p12345), ������(100��)
// ��� : ������ ����(�Է°����� �����ް�, ��°��� ����),
//	         ������ ����(�Է°��� �����ް�, ��°��� ���� ������)

	String code;
	int stockNum;

	void addStock(int amount) { // amount�� �Է°��� ���� ��ġ�� �����س��� ��
		stockNum += amount; // �⺻ ���� �Է� ���� ���ļ� �������̶� ��
	}

	int subtrackStock(int amount) {
		if (stockNum > amount) { // �������� �Է°����� ũ�ٸ�
			stockNum -= amount;
		}
		return stockNum;
	}

}
