package ClassText;

public class Account3 {
	
	private String accountNum;
	private int balance;
	private String name;
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setName(String name) {
		this.name = name;
	}
	//멤버변수 : 계좌번호를 변경하고 싶다면?
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	
	}
	public Account3() {
		super();
		
	}
	public Account3(String accountNum, String name) {
		super();
		this.accountNum = accountNum;
		this.name = name;
	}

	public Account3(String accountNum, int balance, String name) {
		//super();
		// this() : 이런 생김새는 다른 생성자를 호출한다는 뜻
		this(accountNum,name);
		//this.accountNum = accountNum;
		this.balance = balance;
		//this.name = name;
	}


	//멤버변수의 값을 리턴하고 싶다면? : 메소드로 만들어라, get으로 시작)
	public int getBalance() {
		return balance;
	}
	public String getAccountNum() {
		return accountNum;
	}
	
	public String getName() {
		return name;
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
