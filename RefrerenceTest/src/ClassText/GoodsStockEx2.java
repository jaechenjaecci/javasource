package ClassText;

public class GoodsStockEx2 {
public static void main(String[] args) {
	

	// �⺻������ ����
	GoodsStock2 product1 = new GoodsStock2("p12345",30);
	//product1.code = "p12345";
	//product1.stockNum = 30;
	
	
	System.out.println("���� ������ "+product1.subtrackStock(15));

	
	int stockNum = product1.subtrackStock(15);
	
	System.out.println("���� ������" + stockNum);
	
	
	product1.addStock(5);
	System.out.println("���� ������"+product1.getStockNum());


}
			
}

