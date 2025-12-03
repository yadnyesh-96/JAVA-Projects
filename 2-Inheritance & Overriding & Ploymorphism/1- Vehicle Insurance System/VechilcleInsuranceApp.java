/*
 Q1. Vehicle Insurance System – Premium Calculation
	Create the following class structure:
	Parent class: Vehicle
	Fields: brand, model, basePrice
	Methods: calculatePremium() → returns basePrice * 0.05

	Child classes:
	Car → premium increases by 12% if the car has airbags, otherwise 5%
	Bike → premium increases by 8% if bike has ABS, otherwise 3%

Task:
Accept details for 5 vehicles (mix of Car and Bike).
Calculate premium using overridden logic.
Display the vehicle with the highest insurance premium.
Concepts Used
Method overriding
Polymorphism
Logical conditions
Finding maximum from object array
*/

import java.util.*;
class Vehicle{
	
	 String brand;
	 String model;
	 String feature;
	 double basePrice;
	
	Vehicle(String brand, String model, String feature, double basePrice){
		this.brand=brand;
		this.model=model;
		this.feature=feature;
		this.basePrice=basePrice;
	}
	
	double calculatePremium(){
		return basePrice*0.05;
	}
}
class Car extends Vehicle{
	
	Car(String brand, String model, String feature, double basePrice){
		super(brand,model,feature,basePrice);
	}
	
	double calculatePremium(){
		
		if(feature.equalsIgnoreCase("yes")){
			return basePrice*0.12;
		}else{
			//super.calculatePremium();
			return basePrice*0.05;
		}
		
	}
	
	
}
class Bike extends Vehicle{
	
	Bike(String brand, String model, String feature, double basePrice){
		super(brand,model,feature,basePrice);
	}
	
	double calculatePremium(){
		
		if(feature.equalsIgnoreCase("yes")){
			return basePrice*0.08;
		}else{
			return basePrice*0.03;
		}
		
	}
	
}

public class VechilcleInsuranceApp{
	public static void main(String x[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many Vehicle Entry you have ? :");
		int no=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Vehicle Details below");
		
		Vehicle V1[]=new Vehicle[no];
		
		for(int i=0; i<no; i++){
			sc.nextLine();
			
			System.out.println("Vehicle Type :(Bike/Car)=");
			String type=sc.nextLine();
			sc.nextLine();
			
			System.out.println("Enter the "+type+" Brand: ");
			String bd=sc.nextLine();
			
			sc.nextLine();
			
			System.out.println("Enter the "+type+" Model: "); 
			String md=sc.nextLine();
			sc.nextLine();
			
			String ans;
			if(type.equalsIgnoreCase("Car")){
				System.out.println("The "+type+" has airbags ('yes'/'no') : ");
				ans=sc.nextLine();
			}else{
				System.out.println("The "+type+" has ABS ('yes'/'no') : ");
				ans=sc.nextLine();
			}
			
			sc.nextLine();
			
			System.out.println("Enter the "+type+" Base Price :");
			double price=sc.nextDouble();
			
			if(type.equalsIgnoreCase("Car")){
				V1[i]=new Car(bd,md,ans,price);
				
			}else{
				V1[i]=new Bike(bd,md,ans,price);
				
				/*double realPrice=V1[i].calculatePremium();
				System.out.println("On Road Price: "+realPrice);*/
			}
			
		}
		
		double maxprimePrice=0;
		Vehicle MaxV2=null;
		
		for(Vehicle v:V1){
			
			if(v.calculatePremium() > maxprimePrice){
				maxprimePrice=v.calculatePremium();
				MaxV2=v;
			}
		}
		
		
		System.out.println("\n===== VEHICLE WITH HIGHEST PREMIUM =====");
        System.out.println("Brand: " + MaxV2.brand);
        System.out.println("Model: " + MaxV2.model);
        System.out.println("Premium Amount: " + maxprimePrice);
		
		
	}
}