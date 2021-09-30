package exan;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class BankApplication {
	// ���� ������ �ƴ϶� Ŭ���� ���ʿ� �ٷ� ������
	// - accountArra�� Scanner�� ����������� �θ� �� �ְ� �Ϸ���
	// - ��� ������ ������ ��
	private static Account accountArray[] = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("���� > ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				// ���»����۾�
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("���α׷� ����");
	}

//���� ����
	private static void createAccount() {
// 1. �迭�� ��� �ִ� �� Ȯ��
// 2. ��� �ִٸ� ������� �Է°��� ������� ��ü�� ����,
//    ����ִ� �迭�� ���
// 3. ���¹�ȣ, ������, �ܾ��� ����ڿ��� �ޱ�

		System.out.print("���¹�ȣ�� �Է��ϼ��� : ");
		String ano = scanner.next();
		System.out.print("�̸��� �Է��ϼ���.: ");
		String owner = scanner.next();
		System.out.print("�ܾ��� �Է��ϼ���.: ");
		int balance = scanner.nextInt();

		for (int i = 0; i < accountArray.length; i++) {
			// 100�� ���ư�
			if (accountArray[i] == null) {
				// �迭�� ����ִٸ�
				accountArray[0] = new Account(ano, owner, balance);
				// �Է��ض�
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;
			}

		}
	}

//���� ��� ����
//accountarray�� null�� �ƴ� �κи� ���
	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.printf("%s\t%s\t%d\t\n", accountArray[i].getAno(), accountArray[i].getOwner(),
						accountArray[i].getBalance());
			}
		}
	}
//�����ϱ�
//findAccount ȣ���ؼ� �̿�

	private static void deposit() {
//�Ա��� ���¹�ȣ �Է� �ޱ�
		System.out.print("�Ա��� ���¹�ȣ�� �Է��ϼ��� : ");
		String ano = scanner.next();
//�Է� ���� ���¸� ���� ����Ǿ��ִ� ���¿��� ã��	
		Account account = findAccount(ano);
		// �Աݾ� �Է�
		if (account != null) {
			System.out.print("�Աݾ� : ");
			int amount = scanner.nextInt();
			//���� �ܾ��� �ҷ��ͼ� �ű⿡ �Աݾ��� ���� �� �ٽ� ����
			//setBalcece�� �׳� ���Ͽ��� �Աݾ��� ���� �� balance�� ����
			//�ٽ� ��������
			account.setBalance(account.getBalance() + amount);
		} else {
			System.out.println("�Ա� ���¸� Ȯ�����ּ���.");
		}
	}

//����ϱ�
//findAccount ȣ���ؼ� �̿�
	private static void withdraw() {
		System.out.print("����� ���¹�ȣ�� �Է��ϼ��� : ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		// �Աݾ� �Է�
		if (account != null) {
			System.out.print("��ݾ� : ");
			int amount = scanner.nextInt();
			account.setBalance(account.getBalance() - amount);
		} else {
			System.out.println("��� ���¸� Ȯ�����ּ���.");
		}
	}

// Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		// �Է� ���� ����
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			// 100���� �� ��ä������ �� �� �����ϱ� ���� �ƴ϶��
			if (accountArray[i] != null) {
				// �����°� ���ٸ�, ���������ϱ� equals ���
				if (ano.equals(accountArray[i].getAno())) {
					account = accountArray[i];
					break;
				}
			}

		}

		return account;
	}

}
