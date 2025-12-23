package VehicleCompareApp;

public class VehicleComparisonApplication {
	
		public static void main(String x[]) {
			
			InputVehicle I1=new InputVehicle();
			I1.TakeVehicle();
			Vehicles[] Vd=I1.ReturnData();
			
			Interface i1=new Interface();
			i1.ShowDatabase(Vd);
			
			i1.ShowMileage(Vd);
			i1.AvrageMilagevehicle(Vd)
			
			
		}
}
