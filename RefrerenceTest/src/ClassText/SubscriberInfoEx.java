package ClassText;

public class SubscriberInfoEx {

	public static void main(String[] args) {
		SubscriberInfo Info1 = new SubscriberInfo("��Ƹ�", "ID","!123456");
		SubscriberInfo Info2 
		= new SubscriberInfo("������", "ID2","!123456","010-1234-1234","��������α�");
				
	
		// ��Ƹ� ��ȭ��ȣ �߰�
		Info1.setHp("010-2345-3456");
		
		// ������ �ּ� ����
		Info2.setAddr("����� ���ϱ�");
		

	}

}
