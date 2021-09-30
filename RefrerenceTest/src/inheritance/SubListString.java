package inheritance;

public class SubListString extends ListString {
String name = "성춘향";
	public void List() {
		super.List();//부모가 가지고 있는 리스트를 호출함
		
	System.out.println(name+" 하위클래스");	
	}
	
	public void writer() {
		// 부모가 가지고 있는 이름을 출력하고 싶다면
		System.out.println(super.name);
		super.List();
	}
	
	
	
	
	
	
}
