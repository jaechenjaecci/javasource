package ClassText;

public class AccountEx {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.accountNum = "122-01-12222";
		account1.balance = 10000;
		account1.name = "김아름";
		
		//입금하기 - 반환값이 없기 때문에 호출만 함
		account1.input(50000);
		
		//출금
		System.out.println("현재 잔액: " + account1.output(30000));
	
	
	
	
	
	}

}
