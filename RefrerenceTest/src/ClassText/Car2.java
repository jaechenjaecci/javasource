package ClassText;

public class Car2 {
	//�Ӽ� = ����ȸ��, �𵨸�(����Ƽ��...), ����, �ִ�ӵ�...
	private String company;
	// private�� ���̸� �ܺο� �� �Ӽ��� ������
	// �Ӽ��� �ܺο� �������� ������ ���� �ʰ� �ϱ����ؼ� �׻� private�� �ٿ�����
	private String model;
	private String color;
	private int maxSpeed;
	
	//������ - Ŭ���� �̸��� ����/���� Ÿ�� ����/�ߺ� ������ ���� Ư¡(������ �����ε�)
	                            // �Ȱ��� ������ ���� ����ϴ� ���� �ƴ�, 
	                         //�̸��� �ٸ��� �ϴ� ���� �ƴ� Ÿ���� �ٸ��� �����ϸ� �ߺ����
	//�Ӽ��� private���� �����ϸ鼭 �ܺο��� �Ӽ��� ���� �� ��� �Ӽ��� ����� ���� ���
	//�������� ������ �ʵ��� �ʱⰪ�� �����ϱ� ����, ��ü�� �����ϸ鼭 �غ��ؾ��ϴ� �۾����� �����ϰ��� ��.
	
	Car2() {
		System.out.println("Car2 �⺻ ������");
	}
	
	Car2(String model) {
		System.out.println("Car2 ������ - model �ʱ�ȭ");
	}
	
	Car2(String model, String color) {
		System.out.println("Car2 ������ - model, color �ʱ�ȭ");
	}
	
	Car2(String model, String color, String company, int maxSpeed) {
		System.out.println("Car2 ������ - �Ӽ� ��� �ʱ�ȭ");
	}
	
	
	
	
	
	
	
	//���� = ����, ����...
	void forward() {
		System.out.println("�����ϴ�");
	}void backward(){
		System.out.println("�����ϴ�");
}
}