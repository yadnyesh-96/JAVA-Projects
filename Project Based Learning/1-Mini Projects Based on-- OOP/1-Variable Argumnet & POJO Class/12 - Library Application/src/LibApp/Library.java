package LibApp;

public class Library {
	private String Btitle, authorName;
	
	public String getBtitle() {
		return Btitle;
	}
	public void setBtitle(String btitle) {
		Btitle = btitle;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getBprice() {
		return Bprice;
	}
	public void setBprice(double bprice) {
		Bprice = bprice;
	}
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	private double Bprice;
	private int Bid;
	
	 
}
