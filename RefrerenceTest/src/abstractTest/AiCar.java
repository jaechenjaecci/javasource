package abstractTest;

public class AiCar extends Car {

	public AiCar(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	void drive() {
		
		System.out.println("��������");
	}
	@Override
	void stop() {
		System.out.println("����");

	}
}
