package aray;

public class ArayTest6 {

	public static void main(String[] args) {
		// ������ �迭
		int scores[][] = new int[2][3]; // 2��3�� ����
		
		//�ʱ�ȭ
		scores[0][0] = 15;
		scores[0][1] = 25;
		scores[0][2] = 35;
		
		scores[1][0] = 45;
		scores[1][1] = 55;
		scores[1][2] = 65;
		
		//Ȯ��
		System.out.println("�迭 ����(��) : " +scores.length); //���� ���� ��µ� (���� ĭ�� ����)
		System.out.println("�迭 ����(��) : " +scores[0].length); //���� ���� ��µ�(���� ĭ�� ����)
		
	      for(int i=0; i<scores.length; i++) {
	          for(int j=0; j<scores[i].length; j++) {
	             System.out.print(scores[i][j]+"  ");
	          }
	          System.out.println();
	       }
	       
	       System.out.println();

	       // ���� for��
	       for(int score[] : scores) { // ������ ������ ��ü�� 1���� �迭�̱⶧���� ���Ƿ� ���� ����(����)�� �迭�� ���ǵȴ�.
	          for(int j : score) {
	             System.out.print(j+"  ");
	          }
	          System.out.println();
	       }
	       System.out.println();
	       
	       
	       int arr[][] = {
	             {15, 25},
	             {65, 85, 95}
	       }; // 2�������� ���� ������ �ٸ���.
	       
	       // ���� for��
	       for(int i[] : arr) { 
	          for(int j : i) {
	             System.out.print(j+"  ");
	          }
	          System.out.println();
	       }
	       
	       System.out.println();
	       
	       // �迭 �̸��� ���
	       System.out.println(scores); // ��� : [[I@2a139a55
	       System.out.println(arr); // ��� : [[I@15db9742
	       // �̻��� ���� ��µȴ�.
	       /*
	        * �迭�� �̸��� ���� ������ �̻��� ���� �ּҰ��̴�.(stack������ ����)
	        * �� �ּҸ� ���� ������ ���� ���� ����Ǿ��ִ�.(���� ���� ����� ���� heap����) 
	        *  
	        */

	
}
}


