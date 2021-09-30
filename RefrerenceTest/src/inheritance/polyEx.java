package inheritance;

public class polyEx {

	public static void main(String[] args) {
	
		Parent2 p2 = new Child3();
	// 자동으로 캐스팅이 일어남
		
		p2.field1 = "";
		p2.mehtod1();
		p2.method2();
		
		Child3 c = (Child3)p2;
		c.method3();
		
		
	}

}
