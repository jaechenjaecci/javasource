
public class AccountEx {
	public static void main(String[] args) {
		Account2 account = new Account2("122-12", 10000, "ȫ�浿");
		print(account);
		CheckingAccount checkingAccount = new CheckingAccount("122-13", 20000, "������", "333");
		print(checkingAccount);
		CreditLineAccount creditLineAccount = new CreditLineAccount("122-14", 3000, "��ý�", 100000);
		print(creditLineAccount);
		BounsPointAccount bounsPointAccount = new BounsPointAccount("122-15", 4000, "�屹��", 10);
		print(bounsPointAccount);
		TrafficCardAccount trafficCardAccount = new TrafficCardAccount("122-16", 5000, "�ڹ�", "555", true);
		print((trafficCardAccount));
	}

	public static void print(Account2 account) {
		System.out.println(account);
	}
}
