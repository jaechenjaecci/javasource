package ClassText;

public class Car2 {
	//속성 = 제조회사, 모델명(스포티지...), 색상, 최대속도...
	private String company;
	// private을 붙이면 외부에 이 속성이 가려짐
	// 속성은 외부에 직접적인 영향을 받지 않게 하기위해서 항상 private을 붙여야함
	private String model;
	private String color;
	private int maxSpeed;
	
	//생성자 - 클래스 이름과 동일/리턴 타입 없음/중복 가능한 것이 특징(생성자 오버로딩)
	                            // 똑같이 선언한 것을 허용하는 것이 아님, 
	                         //이름을 다르게 하는 것이 아닌 타입을 다르게 설정하면 중복허용
	//속성을 private으로 변경하면서 외부에서 속성을 만들 수 없어서 속성을 만들기 위해 사용
	//생성자의 목적은 필드의 초기값을 저장하기 위함, 객체를 생성하면서 준비해야하는 작업들을 실행하고자 함.
	
	Car2() {
		System.out.println("Car2 기본 생성자");
	}
	
	Car2(String model) {
		System.out.println("Car2 생성자 - model 초기화");
	}
	
	Car2(String model, String color) {
		System.out.println("Car2 생성자 - model, color 초기화");
	}
	
	Car2(String model, String color, String company, int maxSpeed) {
		System.out.println("Car2 생성자 - 속성 모두 초기화");
	}
	
	
	
	
	
	
	
	//동작 = 전진, 후진...
	void forward() {
		System.out.println("전진하다");
	}void backward(){
		System.out.println("후진하다");
}
}