package inheritance;

public class polyEx {

	public static void main(String[] args) {
	
		Parent2 p2 = new Child3();
	// �ڵ����� ĳ������ �Ͼ
		
		p2.field1 = "";
		p2.mehtod1();
		p2.method2();
		
		Child3 c = (Child3)p2;
		c.method3();
		
		
	}

}
