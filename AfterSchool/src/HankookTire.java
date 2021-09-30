
public class HankookTire extends Tire {

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
		
	}

	@Override
	public boolean roll() {
		++accoumulateRotation;
		if (accoumulateRotation < maxRotation) {
			System.out.println(location + "Hankook Tire ¼ö¸í : " + (maxRotation - accoumulateRotation) + "È¸");
			return true;
		} else {
			System.out.println(location + "Hankook Tire ÆãÅ©");
			return false;

		}
	
	}
	
	
}
