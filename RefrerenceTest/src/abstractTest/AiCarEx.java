package abstractTest;

public class AiCarEx {

	public static void main(String[] args) {
		AiCar ai = new AiCar("black");
		
		ai.start();
		ai.drive();
		ai.stop();

		Car car = new AiCar("white");
		car.start();
		car.drive();
		car.stop();
	}

}
