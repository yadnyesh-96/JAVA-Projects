package product.org.app;

public class Bill {
	Product[] p;

	Bill(Product... p) {
		this.p = p;
	}

	public double calBillwithoutGST() {
		double gst = 0;
		for (int i = 0; i < p.length; i++) {
			gst += p[i].getQuantity() * p[i].getRate();
		}
		return gst;
	}

	public double calBilGST() {
		double bill = 0;
		double final_gst = 0;
		for (int i = 0; i < p.length; i++) {
			bill += p[i].getQuantity() * p[i].getRate();
		}
		final_gst += 0.18 * bill;
		return final_gst+bill;
	}

	public void DisplayBill() {
//		System.out.println("ID\tItem Name\t\tQuantity\tRate");
//		System.out.println("--\t---------\t\t--------\t--------");
//		for (int i = 0; i < p.length; i++) {
//			System.out.println(
//					p[i].getProID() + "\t" + p[i].getProName() + "\t\t" + p[i].getQuantity() + "\t" + p[i].getRate());
//		}
//		System.out.println("--\t---------\t\t--------\t--------");
//		System.out.println("Bill Without GST\t\t\t=" + calBillwithoutGST());
//		System.out.println("-----------------------------------------------");
//		System.out.println("Bill With (18%)GST\t\t\t=" + calBilGST());

		System.out.println("---------------------------------------------------------------");
		System.out.printf("%-5s %-20s %-10s %-10s%n", "ID", "Item Name", "Quantity", "Rate");
		System.out.println("---------------------------------------------------------------");

		for (int i = 0; i < p.length; i++) {
			System.out.printf("%-5d %-20s %-10d %-10.2f%n", p[i].getProID(), p[i].getProName(), p[i].getQuantity(),
					p[i].getRate());
		}

		System.out.println("---------------------------------------------------------------");
		System.out.printf("%-35s = %.2f%n", "Bill Without GST", calBillwithoutGST());
		System.out.printf("%-35s = %.2f%n", "Bill With (18%) GST", calBilGST());
		System.out.println("---------------------------------------------------------------");

	}
}
