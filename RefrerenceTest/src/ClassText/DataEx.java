package ClassText;

public class DataEx {

	public static void main(String[] args) {
		// x�� ���� 10�� ����
		Data data = new Data();
		//System.out.println("data" + data);
		// ��°� : dataClassText.Data@2a139a55
		//data.x = 10;
		//change(data.x);
		// data ��ü �ȿ� x��� ������ ������ ���� �����ؼ� ����

		System.out.println();
		change(data);
		System.out.println("after change() x = " + data.x);
		// change�� �ޱ����ؼ� Data�� �ƹ��ų� ���������

	}

	// x�� �ƴ� ���� 10�� ����,
	static void change(int x) {
		// x�� 10000���� �ʱ�ȭ�� �ص� ���� data x�� ������ ����
		// change�ȿ� �ִ� x�� ���� ��ȭ��
		x = 10000;
		System.out.println("change() x = " + x);
	}

	static void change(Data d) {
		// change�� data�� �� ȣ���ϸ� d=2a139a55 �̰� ��
		// ���� data�� �ִ� x�� ���� ���� ��������
		//System.out.println(d);

		d.x = 10000;

	}

}
