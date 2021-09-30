
public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 1; i < 6; i++) {
			int problemLocation = car.run();
			// run을 돌려서 나온 값을 problemLocation에 받을 꺼야
			// run 리턴값을 int로 지정해 놓았으니 여기도 int로 설정

			switch (problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 펑크-한국타이어 교체");
				car.frontLeftTire = new HankookTire(15, "앞 왼쪽");
				break;

			case 2:
				System.out.println("앞 오른쪽 펑크-금호타이어 교체");
				car.frontRightTire = new KumhoTire(10, "앞 오른쪽");
				break;

			case 3:
				System.out.println("뒤 왼쪽 펑크");

				break;

			case 4:
				System.out.println("뒤 오른쪽 펑크");

				break;

			default:
				break;
			}
			System.out.println();
		}

	}

}
