
public class DriverEx {

	public static void main(String[] args) {
		Driver drive = new Driver();
		
		Vehicle bus = new Bus();
		//bus.run(); = drive�� ���ؼ� ����
		drive.drive();
		
		Vehicle taxi = new Taxi();
		//taxi.run();
	}

}
