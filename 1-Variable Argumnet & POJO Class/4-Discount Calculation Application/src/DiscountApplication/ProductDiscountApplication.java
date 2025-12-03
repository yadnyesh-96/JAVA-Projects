package DiscountApplication;
/*
 9. Product Discount Calculation
Task:
 Create a Product class with fields: name, price, and discountPercentage.
 In the main method:
Create a Product object.
Calculate the discounted price and print the result.
Explanation:
 This teaches applying percentages and using object fields.
 */
import java.util.*;
public class ProductDiscountApplication {
	
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Producut Discount Calculation");
		System.out.println();
		Product p1=new Product();
		
		System.out.println("Enetr the Product Name:");
		String nm=sc.nextLine();
		p1.setName(nm);
		
		System.out.println("Enter the Product Price:");
		int pr=sc.nextInt();
		p1.setPrice(pr);
		
		System.out.println("Enter the Percentage Discount: ");
		int dsc=sc.nextInt();
		p1.setDiscount(dsc);
		
		
		System.out.println("-----------------------------");
		System.out.println("Name of Product:"+p1.getName());
		System.out.println("Price: "+p1.getPrice()+" Rs."+"\t Applied Discount"+p1.getDiscount()+" %");
		
		//Formula: Discount Amount = Original Price × (Discount % / 100)
		//₹1000 × (30 / 100) = ₹300.
		float disCal=p1.getDiscount()/100f;
		float dT=disCal*p1.getPrice();
		System.out.println("-----------------------------");
		System.out.println("Discount Price: "+dT+" Rs.");
			
	}
}
