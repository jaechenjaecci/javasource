
public class KumhoTire extends Tire {

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		
	}

	@Override
	public boolean roll() {
		++accoumulateRotation;
		if (accoumulateRotation < maxRotation) {
			System.out.println(location + "Kumho Tire ���� : " + (maxRotation - accoumulateRotation) + "ȸ");
			return true;
		} else {
			System.out.println(location + "Kumho Tire ��ũ");
			return false;

		}
	
	}
	
	
}
