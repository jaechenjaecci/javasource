package ClassText;

public class TV {
	// �Ӽ� => ����, ��������, ä��....
	String color;
	boolean power; // <= ��������
	int channel;

	// ���� => ä�κ���(����,����), �����¿���....
	void channelUp() {
		channel++; // channelUp�� �ؾ��ϴ� �۾��� ����ϴ� ����, ä���� ���̱� ���ؼ��� ���ڸ� �ϳ��� �������Ѿ���
	}

	void channelDown() {
		channel--; // channelUp�� �ؾ��ϴ� �۾��� ����ϴ� ����, ä���� ���̱� ���ؼ��� ���ڸ� �ϳ��� ���ҽ��Ѿ���
	}

	void power() {
		// power�� �ؾ��ϴ� �۾��� ����ϴ� ����
		power = !power; //���� ������ ������ ��Ű��, �¿����� �ٲ���
	}
}