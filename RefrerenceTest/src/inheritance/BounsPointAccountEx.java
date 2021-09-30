package inheritance;

public class BounsPointAccountEx {

	public static void main(String[] args) {
		BounsPointAccount bonuspoint = new BounsPointAccount("122-12",10000,"홍길동",100);
		bonuspoint.deposit(100000);
		System.out.println("현재 잔액 : "+bonuspoint.getBalance());
		System.out.println("현재 보너스 포인트 : "+bonuspoint.getBonusPoint());
		

	}

}
