package exam;

public class ColorTv extends TV {
	private int color;


	public ColorTv(int size,int color) {
		super(size);
		this.color = color;
	
	}
public void printProperty() {
	System.out.println(getSize()+"��ġ "+color+"�÷�");
	
}
public int getColor() {
	return color;
}

}

