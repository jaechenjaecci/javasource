package aray;

public class ArayTest8 {

	public static void main(String[] args) {
		// 숫자 카드 45장 만들기(1~45번), 
		int card[] = new int[45];
		for(int i=0;i<card.length;i++) {
			card[i] = i+1; //0번부터 시작했기때문에 1-45번을 담기 위해 1을 더함
		}
	for(int no:card) {
		System.out.print(no+" ");
	}
	
	
	// 카드섞기
	for(int i=0; i<card.length;i++) {
		// 바꿀 위치 선정
		int pos = (int)(Math.random()*45);
		int temp = card[i]; //(a=temp) 임시로 카드 i번에 있는 것을 temp로 이동
		card[i] = card[pos]; //(a=b) 카드 pos자리에 있는 것을 카드 i자리로 이동하고 
		card[pos] = temp; //(b=a) temp에 있는 숫자를 카드 pos자리로 이동 함
		
		
		
	}
	System.out.println();
	for (int no : card) {
	System.out.print(no+ " ");
	
	}

}
}