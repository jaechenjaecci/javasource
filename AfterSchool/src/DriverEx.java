
public class DriverEx {

	public static void main(String[] args) {
		Driver drive = new Driver();
		
		Vehicle bus = new Bus();
		//bus.run(); = drive를 통해서 실행
		drive.drive();
		
		Vehicle taxi = new Taxi();
		//taxi.run();
	}

}
