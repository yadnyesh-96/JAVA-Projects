package ShoppingDiscount;

public class Groceries extends Product{
	
	Groceries(String product_name,double product_price){
		
		super(product_name,product_price);
	}
	
	
	@Override
	double getFinalPrice() {
		double discount=product_price*0.03;
		return product_price-discount;
	}
}
