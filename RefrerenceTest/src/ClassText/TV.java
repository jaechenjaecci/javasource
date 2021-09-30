package ClassText;

public class TV {
	// 속성 => 색상, 전원상태, 채널....
	String color;
	boolean power; // <= 전원상태
	int channel;

	// 동작 => 채널변경(증가,감소), 전원온오프....
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