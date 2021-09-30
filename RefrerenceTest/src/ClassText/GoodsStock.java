package ClassText;

public class GoodsStock {
// 속성 : 상품코드(p12345), 재고수량(100개)
// 기능 : 재고수량 증가(입력값으로 수량받고, 출력값은 없음),
//	         재고수량 감소(입력값은 수량받고, 출력값은 현재 재고수량)

	String code;
	int stockNum;

	void addStock(int amount) { // amount는 입력값을 받을 위치를 설정해놓은 것
		stockNum += amount; // 기본 값에 입력 값을 합쳐서 재고수량이라 함
	}

	int subtrackStock(int amount) {
		if (stockNum > amount) { // 재고수량이 입력값보다 크다면
			stockNum -= amount;
		}
		return stockNum;
	}

}
