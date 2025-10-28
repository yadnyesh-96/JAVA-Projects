package FoodAppOrg;

import java.util.*;
public class InputClass {

	private Food[]f;
	
	
	Scanner sc=new Scanner(System.in);
	
	public void AcceptInput() {
		
		System.out.println("----- You can Only add 5 Food Max and Min -----");
		System.out.println("How many Food You Want From Above List ? :");
		int n=sc.nextInt();
		
		 f=new Food[n];
		for(int i=0; i<f.length; i++) {
			f[i]=new Food();
			
			f[i].setFId(i+101);
			
			
			
			
			System.out.println("Enter the Food Name:= ");
			String nm=sc.nextLine();
			f[i].setFname(nm);
		
			System.out.println("------------------------------");
			sc.nextLine();
			System.out.println("Enter the Food Category:= ");
			String ct=sc.nextLine();
			f[i].setFcategory(ct);
		
			System.out.println("------------------------------");
			
			System.out.println("Enter the price of Food:= ");
			double pr=sc.nextDouble();
			f[i].setFprice(pr);
			
			System.out.println("------------------------------");
			System.out.println("------------------------------");
			
		}
	
		}
	
	
	public Food[] ReturnData() {
		return f;
	}
	
}
