package ClassText;

public class SubscriberInfoEx {

	public static void main(String[] args) {
		SubscriberInfo Info1 = new SubscriberInfo("김아름", "ID","!123456");
		SubscriberInfo Info2 
		= new SubscriberInfo("이제훈", "ID2","!123456","010-1234-1234","서울시종로구");
				
	
		// 김아름 전화번호 추가
		Info1.setHp("010-2345-3456");
		
		// 이제훈 주소 변경
		Info2.setAddr("서울시 성북구");
		

	}

}
