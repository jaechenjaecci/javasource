
public class Car {
	Tire frontLeftTire = new Tire(6, "�տ���");
	Tire frontRightTire = new Tire(4, "�տ�����");
	Tire BackLeftTire = new Tire(3, "�ڿ���");
	Tire BackRightTire = new Tire(4, "�ڿ�����");

	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		if (!frontLeftTire.roll()) {
			stop();
			return 1;
		}
		if (!frontRightTire.roll()) {
			stop();
			return 2;
		}
		if (!BackLeftTire.roll()) {
			stop();
			return 3;
		}
		if (!BackRightTire.roll()) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}

}
