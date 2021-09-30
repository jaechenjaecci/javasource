package test;

// switch(int, double, float, String, enum){
// case 값 1:
// 		해야할 일:
//		break;
//}
public class SwitchEx1 {

	public static void main(String[] args) {
		// 주사위
		// 1-6 사이의 수를 자동으로 생성해주는 것
		// random 0.0 <= 어떤 값 < 1.0
		int num = (int) (Math.random() * 6) + 1;
		// 0-5만 나오기 때문에 1을 더해서 6까지 나올 수 있도록 함
		// 0.99*6=5.94 (6이 안나옴)
		// System.out.println(num);

		// if (num==1) {
		// System.out.println("1번 나옴");
		// } else if (num==2) {
		// System.out.println("2번 나옴");
		// } else if (num==3) {
		// System.out.println("3번 나옴");
		// } else if (num==4) {
		// System.out.println("4번 나옴");
		// } else if (num==5) {
		// system.out.println("5번 나옴");
		// } else {
		// System.out.println("6번 나옴");
		// }
		switch (num) {
		case 1: //num이 1과 같다면 라는 뜻
			System.out.println("1번 나옴");
			break; //다음 구문으로 넘어가지 않도록 해주는 의미
		case 2:
			System.out.println("2번 나옴");
			break;
		case 3:
			System.out.println("3번 나옴");
			break;
		case 4:
			System.out.println("4번 나옴");
			break;
		case 5:
			System.out.println("5번 나옴");
			break;
		default:
			System.out.println("6번 나옴");
		}

	}

}
