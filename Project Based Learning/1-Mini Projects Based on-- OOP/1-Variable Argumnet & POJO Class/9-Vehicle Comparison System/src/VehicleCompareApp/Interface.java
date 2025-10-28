package VehicleCompareApp;

class Interface {


	public void ShowDatabase(Vehicles Vd[]) {
		System.out.printf("%-20s %-15s %-15s %-15s %-20s %-20s\n",
		        "Owner Name", "Car Id", "Car Model", "Fuel Consumed(liters)", "Distance Travelled(km)", "Mileage(km/l)");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		for(int i=0; i<Vd.length; i++) {
			Vd[i].DisplayCar();
			}
		
		System.out.println("-----------------------------------------------------------------------------------------------------");
	}
	
	
	public void ShowMileage(Vehicles Vd[]) {
		
		Vehicles maxV=Vd[0];
		double MaxMilage=Vd[0].getDistanceTravelled()/Vd[0].getFuelConsumtion();
		
		for(int i=1; i<Vd.length; i++) {
			double Milage=Vd[i].getDistanceTravelled()/Vd[i].getFuelConsumtion();
			if(Milage>MaxMilage) {
				MaxMilage=Milage;
				maxV=Vd[i];
			}
		}
		
			System.out.println("----------------------------------------");
		    System.out.println("        🚗 Best Mileage Vehicle          ");
		    System.out.println("----------------------------------------");
		    System.out.println("Owner Name     : " + maxV.getOwnerName());
		    System.out.println("Car ID         : " + maxV.getCARid());
		    System.out.println("Car Model      : " + maxV.getModelDeatal());
		    System.out.println("Fuel Consumed  : " + maxV.getFuelConsumtion());
		    System.out.println("Distance Travel: " + maxV.getDistanceTravelled());
		    System.out.printf ("Mileage        : %.2f km/l\n", MaxMilage);
		    System.out.println("----------------------------------------");
		
		
	}
	
	
	public void AvrageMilagevehicle(Vehicles Vd[]) {
		
	
		double sum=0;
		for(Vehicles V: Vd) {
			
			sum+=V.getDistanceTravelled()/V.getFuelConsumtion();
			
		}
		double Avg=sum/Vd.length;
		System.out.println("The Average Milage is := "+Avg);
		// Average Stored in the now 'Avg'
		
		boolean found = false;
		for(Vehicles A:Vd) {
			double milage=A.getDistanceTravelled()/A.getFuelConsumtion();
			if(milage>Avg) {
				found = true;
					System.out.println("----------------------------------------");
		            System.out.println("            Vehicle Details             ");
		            System.out.println("----------------------------------------");
		            System.out.println("Car ID     : " + A.getCARid());
		            System.out.println("Model      : " + A.getModelDeatal());
		            System.out.println("Owner Name : " + A.getOwnerName());
		            System.out.println("Fuel Used  : " + A.getFuelConsumtion());
		            System.out.println("Distance   : " + A.getDistanceTravelled());
		            System.out.printf("Mileage    : %.2f\n", milage);
		            System.out.println("----------------------------------------");
			}
		}
		
		if(!found) {
			System.out.println("In the Database Don't have the Car Above the Average Milage");
		}
		
	}
}

