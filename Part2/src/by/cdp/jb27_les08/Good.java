package by.cdp.jb27_les08;

public class Good {
	public String name;
	private int price;
	
	public Good (String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	public void setName(String name) {
	this.name = name;
	}
	public void setGoodPrice(int price) {
		this.price=price;
	}
	public String getName() {return name;}
	public int getGoodPrice() {return price;}

	@Override
	public String toString() {
		return "Good [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
