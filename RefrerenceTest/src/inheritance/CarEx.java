package inheritance;

public class CarEx {

	public static void main(String[] args) {
		FireEngine f;
		Ambulance a;
		
//		f=a;
	f=new FireEngine();
	Car car = f; //업캐스팅 : 형변환 생략가능
	
	
	FireEngine f2;
	f2 = (FireEngine) car;  //다운캐스팅 : 형변환 생략불가
	// FireEngine f2 = new (FireEngine) car : 같음
	// 왼쪽에 부모 클래스가 와야하는데 자식클래스가 와서 다운 캐스팅한것임
	
	f2.water();
	}

}
