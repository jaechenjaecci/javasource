package ClassText;

public class DataEx {

	public static void main(String[] args) {
		// x의 값을 10로 지정
		Data data = new Data();
		//System.out.println("data" + data);
		// 출력값 : dataClassText.Data@2a139a55
		//data.x = 10;
		//change(data.x);
		// data 객체 안에 x멤버 변수가 가지는 값을 복사해서 보냄

		System.out.println();
		change(data);
		System.out.println("after change() x = " + data.x);
		// change를 받기위해선 Data값 아무거나 보내줘야함

	}

	// x가 아닌 값인 10을 받음,
	static void change(int x) {
		// x를 10000으로 초기화를 해도 원래 data x는 변하지 않음
		// change안에 있는 x의 값만 변화함
		x = 10000;
		System.out.println("change() x = " + x);
	}

	static void change(Data d) {
		// change에 data를 찍어서 호츌하면 d=2a139a55 이게 들어감
		// 이제 data에 있는 x에 직접 접근 가능해짐
		//System.out.println(d);

		d.x = 10000;

	}

}
