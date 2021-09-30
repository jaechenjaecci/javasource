
public class HankookTire extends Tire {

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
		
	}

	@Override
	public boolean roll() {
		++accoumulateRotation;
		if (accoumulateRotation < maxRotation) {
			System.out.println(location + "Hankook Tire ���� : " + (maxRotation - accoumulateRotation) + "ȸ");
			return true;
		} else {
			System.out.println(location + "Hankook Tire ��ũ");
			return false;

		}
	
	}
	
	
}
