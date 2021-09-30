package exam;

public class IPTV extends ColorTv {
	private String add;

	public IPTV(int size, int color, String add) {
		super(size, color);
		this.add = add;
	}
	public void printProperty() {
		super.printProperty();
		System.out.println("나의 IPTV는 "+add+"주소의 "+getSize()+"인치 "+getColor()+"컬러");
		
	}
}
