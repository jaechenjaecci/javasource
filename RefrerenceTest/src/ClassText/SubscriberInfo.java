package ClassText;

public class SubscriberInfo {
 
//�Ӽ� - �̸�, ���̵�, �н�����, ��ȭ��ȣ, �ּ�
private String name;
private String id;
private String pw; 
private String hp;
private String addr;


//������ -�̸�, ���̵�, �н����常 �ʱ�ȭ�� �� �� ��ü����
//      �̸�, ���̵�, �н�����, ��ȭ��ȣ, �ּҸ� �ʱ�ȭ �� �� ��ü����
public SubscriberInfo(String name, String id, String pw) {
	super();
	this.name = name;
	this.id = id;
	this.pw = pw;
}
public SubscriberInfo(String name, String id, String pw, String hp, String addr) {
	super();
	this.name = name;
	this.id = id;
	this.pw = pw;
	this.hp = hp;
	this.addr = addr;
}


//��� - �н����� ����, ��ȭ��ȣ ����, �ּҺ���
//setter�޼ҵ�
public void setPw(String pw) {
	this.pw = pw;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public void setHp(String hp) {
	this.hp = hp;
}

}
