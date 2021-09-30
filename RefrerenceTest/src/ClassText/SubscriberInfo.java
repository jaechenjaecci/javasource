package ClassText;

public class SubscriberInfo {
 
//속성 - 이름, 아이디, 패스워드, 전화번호, 주소
private String name;
private String id;
private String pw; 
private String hp;
private String addr;


//생성자 -이름, 아이디, 패스워드만 초기화를 한 후 객체생성
//      이름, 아이디, 패스워드, 전화번호, 주소를 초기화 한 후 객체생성
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


//기능 - 패스워드 변경, 전화번호 변경, 주소변경
//setter메소드
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
