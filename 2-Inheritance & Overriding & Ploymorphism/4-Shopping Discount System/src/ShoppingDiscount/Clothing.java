package ShoppingDiscount;

public class Clothing extends Product{
		String Sale_Type;
	
		Clothing(String product_name,double product_price,String Sale_Type){
			super(product_name,product_price);
			
			this.Sale_Type=Sale_Type;
		}
		
		@Override
		double getFinalPrice() {
			double discount=product_price*0.30;
				
			if(Sale_Type.equalsIgnoreCase("seasonalSale")) {
				return product_price-discount;
			}else {
				discount=product_price*0.05;
				return product_price-discount;
			}

		}
}
