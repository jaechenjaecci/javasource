package ClassText;

public class AccountEx {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.accountNum = "122-01-12222";
		account1.balance = 10000;
		account1.name = "��Ƹ�";
		
		//�Ա��ϱ� - ��ȯ���� ���� ������ ȣ�⸸ ��
		account1.input(50000);
		
		//���
		System.out.println("���� �ܾ�: " + account1.output(30000));
	
	
	
	
	
	}

}
