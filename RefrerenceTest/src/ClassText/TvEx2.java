package ClassText;

public class TvEx2 {
	public static void main(String[] args) {

		// 객체를 선언하고 생성
		TV2 tv1 = new TV2("black",8); //색깔은 블랙, 채널은 8번으로 만들어줘
		TV2 tv2 = new TV2(); //기본 모양으로 만들어줘
	

		// 객체조작
		
	
		// 리모컨에서 플러스 하나 누르는거랑 같은 의미, 얘를 한번 쓰면 1을 더해서 2에서 3이 됨

		System.out.println("채널상태 : " + tv1.channel);

	}
}
