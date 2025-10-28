package DiscountApplication;

public class Product {

	//name, price, and discountPercentage.
	
	private int price, disc;
	private String name;
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setDiscount(int disc) {
		this.disc=disc;
	}
	
	public int getDiscount() {
		return disc;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	
	
}
