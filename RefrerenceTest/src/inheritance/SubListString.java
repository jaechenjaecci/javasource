package inheritance;

public class SubListString extends ListString {
String name = "������";
	public void List() {
		super.List();//�θ� ������ �ִ� ����Ʈ�� ȣ����
		
	System.out.println(name+" ����Ŭ����");	
	}
	
	public void writer() {
		// �θ� ������ �ִ� �̸��� ����ϰ� �ʹٸ�
		System.out.println(super.name);
		super.List();
	}
	
	
	
	
	
	
}
