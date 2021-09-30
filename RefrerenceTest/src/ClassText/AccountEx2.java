package ClassText;

import inheritance.Account2;

public class AccountEx2 {

	public static void main(String[] args) {
		Account2 account1 = new Account2(null, 0, null);
		//account1.accountNum = "122-01-12222";
		//account1.balance = 10000;
		//account1.name = "김아름";
		//계좌번호, 이름을 부여하는 방법 : 외부로 부터 값을 받아서 멤버변수의 값을
		//변경하는 작업 시 set이라는 키워드로 메소드를 작성함
		//멤버변수 : 계좌번호를 변경하고 싶다면?
		account1.setBalance(10000);
		account1.setAccountNo("122-01-12222");
		account1.setName("홍길동");
		
		//입금하기 - 반환값이 없기 때문에 호출만 함
		account1.deposit(50000);
		System.out.println("입금 후 잔액 : "+account1.getBalance());
		
		//출금
		System.out.println("현재 잔액: " + account1.withdraw(30000));
	
	//성춘향 계좌
		Account2 account2 = new Account2("122-01-13333", "성춘향");
		System.out.println("현재 잔액 조회 : "+account2.getBalance());
		
		
	//박보검 계좌
		Account2 account3 = new Account2("122-01-14444", 100000, "박보검");
		System.out.println("현재 잔액 조회 : "+account3.getBalance());
	
	}

}
