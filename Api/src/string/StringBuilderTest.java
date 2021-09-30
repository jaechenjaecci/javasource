package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		 String data = "ABC";
		// data +="DEF";
		// data+="";
		// ���ڿ��� ����,������ �ȵ�, �ڿ� ���̴� �͵� �ȵǼ�
		// ������ �ؼ� �Ź� ���ο� ���ڿ��� ����
		// �̷� �۾��� ��ӵ� ���� ���������� �޸𸮰� �ı��ǰ� �ٽ� ����� �ݺ�
		// String���� builder�� insert �޼ҵ尡 ����

		// ���� �ִ� �۾��� �� �� ȿ�������� �ϱ� ���� ������� ��
		// StringBuffer, StringBuilder
		// �޸𸮸� �ı��ϰ� �ٽ� ����°� �ƴ϶�, ���ڿ� �ڿ� �ٿ������� �����

		//��Ƽ������ ����
		StringBuffer buffer = new StringBuffer();
		
		//���Ͻ����� ����
		StringBuilder builder = new StringBuilder();
		
		// ����, �߰�
		builder.append("ABC");
		builder.append("DEF");
		System.out.println("append : "+builder);

		// ����
		builder.insert(3, "34");
		System.out.println(builder);

		// ����
		builder.delete(1, 3);
		System.out.println(builder);

		String str1 = "Java Programming";
		StringBuilder builder1 = new StringBuilder(str1);
		// �̸� ������ �ߴµ� �����ؾ��ϴ� �κ��� ���� ��� �ٽ� �����ϸ� ��
		builder1.append(3.14);
		builder1.deleteCharAt(1);
		System.out.println(builder1);

	}

}
