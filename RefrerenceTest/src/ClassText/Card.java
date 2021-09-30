package ClassText;

public class Card {
	// 멤버변수 : 객체를 생성할 때 메모리에 올라가게 됨
	// 원카드 모양 정의
	private String kind;
	// 카드 숫자 지정
	private int number;

	static int width = 10;
	static int height = 7;

	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

	public String getKind() {
		return kind;
	}

	public int getNumber() {
		return number;
	}

	public static int getWidth() {

		return width;
	}

	public static int getHeight() {
		return height;
	}

}
