package ClassText;

public class Account {
	// �Ӽ� : ���¹�ȣ(122-01-12222), �ܾ�(����), �̸�(��������)
	// ��� : �Ա��Ѵ�(�Է°� : �Աݾ�,��ȯ������), => �����ܾ� +=�Աݾ�
	// ����Ѵ�.(�Է°� : ��ݾ�, ��ȯ��:�����ܾ�) => �����ܾ� -=��ݾ�

	String accountNum;
	int balance;
	String name;

	Account() {

	}

	void input(int amount) {
		balance += amount;
	}

	int output(int amount) {
		if (balance > amount) {
			balance -= amount;
		}
		return balance;
	}

}
