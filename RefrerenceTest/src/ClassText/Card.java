package ClassText;

public class Card {
	// ������� : ��ü�� ������ �� �޸𸮿� �ö󰡰� ��
	// ��ī�� ��� ����
	private String kind;
	// ī�� ���� ����
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
