package poly;

public class Product {
	private int price;
	private int bonusPoint;
	
	public Product(int price) {
		super();
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	
	
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	
	
	public int getPrice() {
		return price;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	public String toString() {
		return "Tv";
	}

	
}
