package looptext;

public class WhileTest1 {

	public static void main(String[] args) {
		// for (int i = 0; i < 10; i++) {
		// System.out.println("�ȳ��ϼ���!");
		
		
		int i = 0;
		while (i < 10) {
			System.out.println("�ȳ��ϼ���!");
			i++;
		}
	System.out.println();
	
	i=1;
	while (i<11) {
		System.out.print(i+"\t");
	i++;
	
	}
	
	System.out.println();
	
	i=0;
	while(i<11) {
	System.out.print(i+"\t");
	i+=2;
	}
System.out.println();
	
	i=3;
	while(i<101) {
	System.out.print(i+"\t");
	i+=3;
}
}
}