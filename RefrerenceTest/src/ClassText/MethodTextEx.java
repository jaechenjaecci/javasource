package ClassText;

public class MethodTextEx {

	public static void main(String[] args) {
		MethodText1 obj = new MethodText1();
		
		//�޼ҵ� ȣ�� �� ���ϵǴ� ���� �ִ� ���
		//print() or ���� �Ǵ� �� �ޱ� : �� �߿� �ϳ� �ϸ� ��
		
		System.out.println(obj.isRedirect());
		//���ϵǴ� ���� �״�� ��µ�
		boolean result =obj.isRedirect();
		//���� �Ǵ� ���� �޴� ��� ������ Ÿ�԰� ���� �ڷ������� �����ؾ���
		//���ϵǴ� ���� �޴� �ٴ� �� �����°��� �����Ѵٴ� ��
		//result�� �����߱� ������ result�� �̿��� �ڵ� �ۼ��� ����
		
		int var1 = obj.sum();
		System.out.println(obj.add(25, 35));
		
		
		
		
		
		
		
		
		
	}

}
