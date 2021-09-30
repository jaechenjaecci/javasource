package shop;

public class ShopEx {

	public static void main(String[] args) {
		Myshop shop = new Myshop();
		// 상점이름
		shop.setTitle("신나는 쇼핑");
		// 고객생성
		shop.genUser();
		// 제품생성
		shop.genProduct();
		// 상점시작
		shop.start();
		
	}

}
