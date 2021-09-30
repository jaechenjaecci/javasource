package ClassText;

public class GoodsStock2 {
// 속성 : 상품코드(p12345), 재고수량(100개)
// 기능 : 재고수량 증가(입력값으로 수량받고, 출력값은 없음),
//	         재고수량 감소(입력값은 수량받고, 출력값은 현재 재고수량)

	private String code;
	private int stockNum;

	// 기본생성자 : default 생성자
	GoodsStock2() {
	}

	// 생성자 오버로딩
	GoodsStock2(String code,int stockNum) { //순서대로 넘김
		this.code = code;      //this.code는 굿즈스탁2에 들어오는 변수
		this.stockNum = stockNum;
	}
	
	void addStock(int amount) {
		stockNum += amount;
	}

	int subtrackStock(int amount) {
		if (stockNum > amount) {
			stockNum -= amount;
		}
		return stockNum;
	}

	// 현재 재고수량을 리턴하는 기능
	int getStockNum() {
		return stockNum;
	}
	
	
}
