package exception;

public class ThrowsEx {

	public static void main(String[] args) {
		//main���� ó���Ѵٴ� �ǹ̴� jvm���� �������ٴ� �ǹ�, ȭ���� ����Ѵٴ� ��
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	// ���⼭ �߻��� ���ܸ� �� �޼ҵ带 ȣ���ϴ� ������ ��������
	public static void findClass() throws ClassNotFoundException {
		Class.forName("");
	}
}
