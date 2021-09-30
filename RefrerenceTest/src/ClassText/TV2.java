package ClassText;

public class TV2 {
	// 속성 => 색상, 전원상태, 채널....
	String color;
	boolean power; // <= 전원상태
	int channel;

	// 생성자
	TV2(){
	// 가로안에 아무것도 없는 것을 default 기본 생성자라고 함
	// 기본생성자의 특징은 명시적으로 생성자가 하나도 선언되지 않았다면 컴파일러가 자동으로 만들어냄
	}
	
	TV2(String color,int channel){
		this.color = color; //this는 본인을 뜻함, 내가 갖고 있는 컬러
		this.channel = channel; // 내가 갖고 있는 채널이라는 뜻
	}
	
	
	
	// 동작(메소드) => 채널변경(증가,감소), 전원온오프....
	void channelUp() {
		channel++; // channelUp가 해야하는 작업을 기록하는 공간, 채널을 높이기 위해서는 숫자를 하나씩 증가시켜야함
	}

	void channelDown() {
		channel--; // channelUp가 해야하는 작업을 기록하는 공간, 채널을 높이기 위해서는 숫자를 하나씩 감소시켜야함
	}

	void power() {
		// power가 해야하는 작업을 기록하는 공간
		power = !power; //가진 값에서 부정을 시키면, 온오프가 바꿔짐
	}
}