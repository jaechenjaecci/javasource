package ClassText;

public class TV2 {
	// �Ӽ� => ����, ��������, ä��....
	String color;
	boolean power; // <= ��������
	int channel;

	// ������
	TV2(){
	// ���ξȿ� �ƹ��͵� ���� ���� default �⺻ �����ڶ�� ��
	// �⺻�������� Ư¡�� ��������� �����ڰ� �ϳ��� ������� �ʾҴٸ� �����Ϸ��� �ڵ����� ����
	}
	
	TV2(String color,int channel){
		this.color = color; //this�� ������ ����, ���� ���� �ִ� �÷�
		this.channel = channel; // ���� ���� �ִ� ä���̶�� ��
	}
	
	
	
	// ����(�޼ҵ�) => ä�κ���(����,����), �����¿���....
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