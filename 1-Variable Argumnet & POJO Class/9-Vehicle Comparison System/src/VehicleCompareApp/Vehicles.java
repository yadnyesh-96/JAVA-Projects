package VehicleCompareApp;

class Vehicles {
	
	//carId, model, fuelConsumed, and distanceTravelled
	// defied the required fields here also using POJO class we set and get the there data. 
	private int carId, FuelConsumed, distanceTravelled;
	private String model, OwnerName;
	
	public void setCARid(int carId) {
		this.carId=carId;
	}
	public int getCARid() {
		return carId;
	}
	
	public void setFuelConsumtion(int FuelConsumed) {
		this.FuelConsumed=FuelConsumed;
	}
	public int getFuelConsumtion() {
		return FuelConsumed;
	}
	
	public void setDistanceTravelled(int distanceTravelled) {
		this.distanceTravelled=distanceTravelled;
	}
	
	public int getDistanceTravelled() {
		return distanceTravelled;
	}
	
	public void setModelDetail(String model) {
		this.model=model;
	}
	public String getModelDeatal() {
		return model;
	}
	
	public void setOwnerInfo(String OwnerName) {
		this.OwnerName=OwnerName;
	}
	
	public String getOwnerName() {
		return OwnerName;
	}

	// Here we defined the method to get the data or view the data.
	
	public void DisplayCar() {
		double mileage=distanceTravelled/FuelConsumed;
		System.out.printf("%-20s %-15s %-15s %-15s %-20s %-20s\n",
		        OwnerName, carId, model, FuelConsumed, distanceTravelled,mileage);
		
	}
	
}
