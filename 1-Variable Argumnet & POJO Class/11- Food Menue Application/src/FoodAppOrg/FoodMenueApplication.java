package FoodAppOrg;

public class FoodMenueApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceClass d1=new InterfaceClass();
		d1.FoodMenue();
		
		InputClass i1=new InputClass();
		i1.AcceptInput();
		
		
		Food arr[]=i1.ReturnData();
		
		
		d1.ShowData(arr);
		
	}

}
