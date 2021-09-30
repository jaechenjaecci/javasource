package ClassText;

public class CarEx2 {

	public static void main(String[] args) {

		// 첫번째 차
		// 객체 생성 시 생성자가 자동 호출됨
		Car2 car = new Car2();
		// 기본속성 값은 Null, 0, false, 0.0이 담겨있음

		/*
		 * car.company = "현대"; car.model = "KONA"; car.color = "red"; car.maxSpeed =
		 * 200;
		 */

		// 두번째 차 : 새로운 차를 생성할 때 속성들만 변경해주면 됨
		// 객체 생성 시 생성자가 자동 호출됨
		Car2 car2 = new Car2("kona");
		// 지정되지 않는 값들은 null 값 등으로 지정되어 있음
		
		
		//세번째 차
		Car2 car3 = new Car2("kona", "black");
		
		//네번째차
		Car2 car4 = new Car2("현대","kona", "black",250);

		/*
		 * car.company = "현대"; // The field Car2.company is not visible
		 * 
		 * car.model = "산타페"; car.color = "black"; car.maxSpeed = 250;
		 */

	}

}
