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
	//������� : ���¹�ȣ�� �����ϰ� �ʹٸ�?
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
		// this() : �̷� ������� �ٸ� �����ڸ� ȣ���Ѵٴ� ��
		this(accountNum,name);
		//this.accountNum = accountNum;
		this.balance = balance;
		//this.name = name;
	}


	//��������� ���� �����ϰ� �ʹٸ�? : �޼ҵ�� ������, get���� ����)
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
