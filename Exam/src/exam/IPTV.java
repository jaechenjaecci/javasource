package exam;

public class IPTV extends ColorTv {
	private String add;

	public IPTV(int size, int color, String add) {
		super(size, color);
		this.add = add;
	}
	public void printProperty() {
		super.printProperty();
		System.out.println("���� IPTV�� "+add+"�ּ��� "+getSize()+"��ġ "+getColor()+"�÷�");
		
	}
}
