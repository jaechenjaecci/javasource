package inheritance;

public class CarEx {

	public static void main(String[] args) {
		FireEngine f;
		Ambulance a;
		
//		f=a;
	f=new FireEngine();
	Car car = f; //��ĳ���� : ����ȯ ��������
	
	
	FireEngine f2;
	f2 = (FireEngine) car;  //�ٿ�ĳ���� : ����ȯ �����Ұ�
	// FireEngine f2 = new (FireEngine) car : ����
	// ���ʿ� �θ� Ŭ������ �;��ϴµ� �ڽ�Ŭ������ �ͼ� �ٿ� ĳ�����Ѱ���
	
	f2.water();
	}

}
