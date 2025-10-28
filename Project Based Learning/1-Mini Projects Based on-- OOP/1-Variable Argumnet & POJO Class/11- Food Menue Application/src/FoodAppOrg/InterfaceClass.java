package FoodAppOrg;

public class InterfaceClass {
		
	void ShowData( Food f[]) {
		System.out.println("\n========= FOOD MENU =========\n");
        System.out.printf("%-5s %-20s %-15s %-10s\n", "ID", "Food Name", "Category", "Price");
        System.out.println("-------------------------------------------------------------");
        //for calculating the Total price 
        double total=0;
		for(int i=0; i<f.length; i++) {
			total+=f[i].getFprice();
			 System.out.printf("%-5d %-20s %-15s %-10.2f\n",
	                    f[i].getFId(), f[i].getFname(), f[i].getFcategory(), f[i].getFprice());

		}
		
		System.out.println("=============================================================\n");
		System.out.println("TOTAL					 =  "+total);
		System.out.println("-------------------------------------------------------------");
		System.out.println("TOTAL + GST(18%) 	     	     =  "+(total+0.18));
		
	}
	
	
	void FoodMenue(){
		System.out.println("ID    Food Name           Category         Price     ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("101   Pizza               Fast Food        150.00    ");
        System.out.println("102   Dosa                South Indian     100.00    ");
        System.out.println("103   Pasta               Fast Food        40.00     ");
        System.out.println("104   Choclate Shake      Liquid/shake     80.00     ");
        System.out.println("105   PavBhaji            Breakfast        120.00    ");
        System.out.println("106   Burger              Fast Food        130.00    ");
        System.out.println("107   Idli Sambhar        South Indian     90.00     ");
        System.out.println("108   Veg Sandwich        Snack            70.00     ");
        System.out.println("109   Mango Smoothie      Liquid/shake     110.00    ");
        System.out.println("110   Poha                Breakfast        60.00     ");
        System.out.println("111   French Fries        Fast Food        85.00     ");
        System.out.println("=============================================================");
	}
	
	
	
}

