package com.samsung.project;

public class Account {
	// �Ӽ� : ���¹�ȣ(122-01-12222), �ܾ�(����), �̸�(��������)
	// ��� : �Ա��Ѵ�(�Է°� : �Աݾ�,��ȯ������), => �����ܾ� +=�Աݾ�
	// ����Ѵ�.(�Է°� : ��ݾ�, ��ȯ��:�����ܾ�) => �����ܾ� -=��ݾ�

	String accountNum;
	int balance;
	String name;


	public Account(String accountNum, int balance, String name) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
		this.name = name;
	}

	public void input(int amount) {
		balance += amount;
	}

	public int output(int amount) {
		if (balance > amount) {
			balance -= amount;
		}
		return balance;
	}

}
