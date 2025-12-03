
package ShoppingDiscount;


public class Product {
	String product_name;
	double product_price;
	
	Product(String product_name,double product_price){
		
		this.product_name=product_name;
		this.product_price=product_price;
	}
	
	double getFinalPrice() {
		return 0;
	}
}
