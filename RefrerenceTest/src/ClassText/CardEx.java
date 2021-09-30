package ClassText;

public class CardEx {

	public static void main(String[] args) {
		Card card1 = new Card("spade", 7);
		cardPrint(card1);
		// 카드 크기가 중복되는 경우 일일이 코드를 작성하는 것보다 더 효율적인 방법이 있다면?
		// 멤버변수에서 숫자를 지정하는 방식은 적절하지 못함, 클래스변수로 지정

		Card card2 = new Card("heart", 2);
		cardPrint(card2);
	}

	static void cardPrint(Card card) {
		System.out.println("숫자"+card.getNumber());
		System.out.println("모양"+card.getKind());
		System.out.printf("카드 크기(%d,%d)\n",Card.width,Card.height);
	System.out.println();
	}
}
