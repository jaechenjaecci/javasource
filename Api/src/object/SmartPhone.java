package object;

public class SmartPhone {
private String company;
private String os;

public SmartPhone(String company, String os) {
	super();
	this.company = company;
	this.os = os;
}

@Override
public String toString() { //객체가 가지고 있는 멤버변수의 값을 출력하는 용도로 오버라이딩을 사용
	return "SmartPhone [company=" + company + ", os=" + os + "]";
}




}
