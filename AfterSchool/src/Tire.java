
public class Tire {
	// �ִ� ȸ����(Ÿ�̾����)
	int maxRotation;

	// ����ȸ����
	int accoumulateRotation;

	// Ÿ�̾� ��ġ
	String location;
	
	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}

	public boolean roll() {
		++accoumulateRotation;
		if (accoumulateRotation < maxRotation) {
			System.out.println(location + "Tire ���� : " + (maxRotation - accoumulateRotation) + "ȸ");
			return true;
		} else {
			System.out.println(location + "Tire ��ũ");
			return false;

		}
	}
}
