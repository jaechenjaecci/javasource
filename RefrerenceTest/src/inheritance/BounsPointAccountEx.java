package inheritance;

public class BounsPointAccountEx {

	public static void main(String[] args) {
		BounsPointAccount bonuspoint = new BounsPointAccount("122-12",10000,"ȫ�浿",100);
		bonuspoint.deposit(100000);
		System.out.println("���� �ܾ� : "+bonuspoint.getBalance());
		System.out.println("���� ���ʽ� ����Ʈ : "+bonuspoint.getBonusPoint());
		

	}

}
