package FoodAppOrg;

public class Food {

		private int fid;
		private String fname, fcategory;
		private double fprice;
		
		void setFId(int fid) {
			this.fid=fid;
		}
		
		int getFId() {
			return fid;
		}
		
		void setFname(String fname) {
			this.fname=fname;
		}
		
		String getFname() {
			return fname;
		}
		
		void setFcategory(String fcategory) {
			this.fcategory=fcategory;
		}
		
		String getFcategory() {
			return fcategory;
		}
		
		void setFprice(double fprice) {
			this.fprice=fprice;
		}
		
		double getFprice() {
			return fprice;
		}
		
}
