package aray;

public class ArayTest8 {

	public static void main(String[] args) {
		// ���� ī�� 45�� �����(1~45��), 
		int card[] = new int[45];
		for(int i=0;i<card.length;i++) {
			card[i] = i+1; //0������ �����߱⶧���� 1-45���� ��� ���� 1�� ����
		}
	for(int no:card) {
		System.out.print(no+" ");
	}
	
	
	// ī�弯��
	for(int i=0; i<card.length;i++) {
		// �ٲ� ��ġ ����
		int pos = (int)(Math.random()*45);
		int temp = card[i]; //(a=temp) �ӽ÷� ī�� i���� �ִ� ���� temp�� �̵�
		card[i] = card[pos]; //(a=b) ī�� pos�ڸ��� �ִ� ���� ī�� i�ڸ��� �̵��ϰ� 
		card[pos] = temp; //(b=a) temp�� �ִ� ���ڸ� ī�� pos�ڸ��� �̵� ��
		
		
		
	}
	System.out.println();
	for (int no : card) {
	System.out.print(no+ " ");
	
	}

}
}