package looptext;

public class ForTest1 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("�ȳ��ϼ���!");
		}
		System.out.println();
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println();

		for (int i = 0; i < 11; i += 2) {
			System.out.print(i + "\t");
		}
		System.out.println();

		for (int i = 3; i < 100; i += 3) {
			System.out.print(i + " ");
		}
	
	//for(int i = 3; i<100; i++) {
	//if (i%3==0) 
			
	//System.out.print(i + " ");
		
		System.out.println();
		
		int sum = 0;
		for (int i = 1; i <100; i++) {
		 if (i % 3 == 0 && i%9!=0) {
			 sum = sum + i;
		}	
		}
		System.out.println("3�� ��� ���̰�, 9�� ����� �ƴ� �� : "+sum);
		System.out.println();
	
		sum = 0;
		for (int i = 1; i <101; i++) {
		 if (i % 3 == 0 || i%5==0) {
			 sum = sum + i;
	}
	}	
		System.out.println("3�� ��� ���̰�, 5�� ����� �� : "+sum);

}
}