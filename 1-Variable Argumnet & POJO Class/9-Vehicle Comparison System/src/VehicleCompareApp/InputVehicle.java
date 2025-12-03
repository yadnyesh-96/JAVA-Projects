package VehicleCompareApp;

import java.util.*;
class InputVehicle {
	
	Scanner sc=new Scanner(System.in);
	private Vehicles[] v1;
	
	public void TakeVehicle() {
		
		System.out.println("How Many Vehicels You Have?");
		int no=sc.nextInt();
		
		v1=new Vehicles[no];
		for(int i=0; i<v1.length; i++) {
			
			v1[i]=new Vehicles();
			
			//here we set up the Automatically the id to the our vehicle 
			v1[i].setCARid(i+1);
			
			System.out.println("----------------------------------------");
			//Takes the input of Owner Name as well
			System.out.println("Enter the Owner Name:");
			sc.nextLine();
			String nm=sc.nextLine();
			v1[i].setOwnerInfo(nm);
			
			System.out.println();
			System.out.println("----------------------------------------");
			//Takes the Model Details of the Vehicle.
			System.out.println("Enter the Model Deatil of your vehicle:");
			String md=sc.nextLine();
			v1[i].setModelDetail(md);
			
			System.out.println();
			System.out.println("----------------------------------------");
			//Takes the Distance Traveled of the vehicle 
			System.out.println("Enter the Distance Travelled:");
			int ds=sc.nextInt();
			v1[i].setDistanceTravelled(ds);
			
			System.out.println();
			System.out.println("----------------------------------------");
			System.out.println("Enter the Fuel Consumtion:");
			int fuel=sc.nextInt();
			v1[i].setFuelConsumtion(fuel);
			
			
			
		}
		
	}
	
	public Vehicles[] ReturnData(){
		return v1;
	}
}
