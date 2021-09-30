package ClassText;

public class Account {
	// 속성 : 계좌번호(122-01-12222), 잔액(정수), 이름(계좌주인)
	// 기능 : 입금한다(입력값 : 입금액,반환값없음), => 현재잔액 +=입금액
	// 출금한다.(입력값 : 출금액, 반환값:현재잔액) => 현재잔액 -=출금액

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
