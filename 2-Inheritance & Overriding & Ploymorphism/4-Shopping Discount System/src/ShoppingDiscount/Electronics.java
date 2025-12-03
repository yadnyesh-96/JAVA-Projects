package ShoppingDiscount;

public class Electronics extends Product{
	
	Electronics(String product_name,double product_price){
		
		super(product_name,product_price);
	}
	
	@Override
	double getFinalPrice(){
		double discount=product_price*0.18;
		if(product_price>20000) {
			return product_price-discount;
		}else {
			discount=product_price*0.10;
			return product_price-discount;
		}
	}
}
