package ClassText;

public class GoodsStock2 {
// �Ӽ� : ��ǰ�ڵ�(p12345), ������(100��)
// ��� : ������ ����(�Է°����� �����ް�, ��°��� ����),
//	         ������ ����(�Է°��� �����ް�, ��°��� ���� ������)

	private String code;
	private int stockNum;

	// �⺻������ : default ������
	GoodsStock2() {
	}

	// ������ �����ε�
	GoodsStock2(String code,int stockNum) { //������� �ѱ�
		this.code = code;      //this.code�� ���Ź2�� ������ ����
		this.stockNum = stockNum;
	}
	
	void addStock(int amount) {
		stockNum += amount;
	}

	int subtrackStock(int amount) {
		if (stockNum > amount) {
			stockNum -= amount;
		}
		return stockNum;
	}

	// ���� �������� �����ϴ� ���
	int getStockNum() {
		return stockNum;
	}
	
	
}
