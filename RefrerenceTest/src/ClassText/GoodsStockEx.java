package ClassText;

public class GoodsStockEx {
public static void main(String[] args) {
	

	//첫번째 상품 재고관리
	GoodsStock product1 = new GoodsStock();
	product1.code = "p12345";
	product1.stockNum = 30;
	
	// 상품판매 => 재고감소
	// 호출 => 리턴값이 있다면 리턴값을 받기(syso,변수)
	//System.out.println("현재 재고수량 "+product1.subtrackStock(15));

	// 변수 선언
	int stockNum = product1.subtrackStock(15);
	//이후로 stockNum을 사용할 수 있음
	System.out.println("현재 재고수량" + stockNum);
	

	// 반품 => 재고증가
	//메소드 호출 => 리턴타입이 없으면 호출만 하면 됨
	//void는 출력도 못함
	product1.addStock(5);
	System.out.println("현재 재고수량"+product1.stockNum);


}
			
}

