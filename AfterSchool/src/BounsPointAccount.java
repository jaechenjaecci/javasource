

public class BounsPointAccount extends Account2 {

	private int bonusPoint;

	public BounsPointAccount(String accountNo, int balance, String name, int bonusPoint) {
		super(accountNo, balance, name);
		this.bonusPoint = bonusPoint;

	}

	void deposit(int amount) {
		super.deposit(amount);

		bonusPoint += amount * 0.001;

	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	@Override
	public String toString() {
		return "BounsPointAccount [bonusPoint=" + bonusPoint + "]";
	}

}
