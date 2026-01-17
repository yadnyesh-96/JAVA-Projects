package product.org.app;

public class Product {
	private int pid;
	private String pname;
	private int quantity;
	private double rate;
	
	public void setProID(int pid) {
		this.pid=pid;
	}
	public int getProID() {
		return pid;
	}
	
	public void setProName(String pname) {
		this.pname=pname;
	}
	public String getProName() {
		return pname;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setRate(double rate) {
		this.rate=rate;
	}
	public double getRate() {
		return rate;
	}
	
}
