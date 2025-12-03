package FoodPriceComparisonApp;
import java.util.*;
/*
 6. Food Item Price Comparison
Task:
 Create a FoodItem class with fields: name and price.
 In the main method:
Create two FoodItem objects.
Compare their prices and print the name of the cheaper food item.
Explanation:
 This helps understand comparison logic with custom objects.
 */

public class FoodPriceApp {
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		Fooditems f1[]=new Fooditems[2];
		
		for(int i=0; i<f1.length; i++) {
			f1[i]=new Fooditems();
			
			System.out.println("Enter the Food Name:");
			String nm=sc.nextLine();
			
			System.out.println("Enter the Price:");
			int pr=sc.nextInt();
			
			f1[i].setName(nm);
			f1[i].setPrice(pr);
			
			sc.nextLine();
		}
		
		int left=0, right=f1.length-1;
		//int max=0;
		while(left<=right) {
			
			if(f1[left].getPrice()>f1[right].getPrice()) {
				System.out.println("\nFood Name:"+f1[left].getName()+"\nPrice: "+f1[left].getPrice()+" Rs.");
			}
			
			if(f1[right].getPrice()>f1[left].getPrice()) {
				System.out.println("\nFood Name:"+f1[right].getName()+"\nPrice: "+f1[right].getPrice()+" Rs.");
			}
			
			left++;
			right--;
		}
		
	}
	
	
	
}
