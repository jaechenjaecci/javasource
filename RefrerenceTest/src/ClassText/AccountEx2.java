package ClassText;

import inheritance.Account2;

public class AccountEx2 {

	public static void main(String[] args) {
		Account2 account1 = new Account2(null, 0, null);
		//account1.accountNum = "122-01-12222";
		//account1.balance = 10000;
		//account1.name = "��Ƹ�";
		//���¹�ȣ, �̸��� �ο��ϴ� ��� : �ܺη� ���� ���� �޾Ƽ� ��������� ����
		//�����ϴ� �۾� �� set�̶�� Ű����� �޼ҵ带 �ۼ���
		//������� : ���¹�ȣ�� �����ϰ� �ʹٸ�?
		account1.setBalance(10000);
		account1.setAccountNo("122-01-12222");
		account1.setName("ȫ�浿");
		
		//�Ա��ϱ� - ��ȯ���� ���� ������ ȣ�⸸ ��
		account1.deposit(50000);
		System.out.println("�Ա� �� �ܾ� : "+account1.getBalance());
		
		//���
		System.out.println("���� �ܾ�: " + account1.withdraw(30000));
	
	//������ ����
		Account2 account2 = new Account2("122-01-13333", "������");
		System.out.println("���� �ܾ� ��ȸ : "+account2.getBalance());
		
		
	//�ں��� ����
		Account2 account3 = new Account2("122-01-14444", 100000, "�ں���");
		System.out.println("���� �ܾ� ��ȸ : "+account3.getBalance());
	
	}

}
