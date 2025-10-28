package EmployeSalaryApplication;

public class Functionality {
	
	public void ShowDatabse(Employee a[]) {
		
		System.out.println();
		System.out.println("Details of Employee");
		System.out.printf("%-5s %-15s %-15s %-10s %-10s %-10s\n", "ID", "Name", "Basic Salary", "HRA", "DA", "Gross");
		System.out.println("--------------------------------------------------------------------------");
		
		for(int i=0;  i<a.length; i++) {
			a[i].DisplayDetails();
		}
	}
	
	
	public void MaxSalEmployee(Employee a[]) {
		
		int m=0;
		double st=a[0].getBasicSal();
		for(int i=1; i<a.length; i++) {
			double ed=a[i].getBasicSal();
			if(ed>st) {
				m=i;
			}
		}
		
		double GrossSal =a[m].getBasicSal()+a[m].getDa()+a[m].getHra();
		System.out.println("========================================");
        System.out.println("        Maximum Salary Employee         ");
        System.out.println("========================================");
        System.out.println("ID          : " + a[m].getEmpId());
        System.out.println("Name        : " + a[m].getName());
        System.out.printf("Basic Salary: %.2f\n", a[m].getBasicSal());
        System.out.println("HRA         : " + a[m].getHra());
        System.out.println("DA          : " + a[m].getDa());
        System.out.printf("Gross Salary: %.2f\n",GrossSal );
        System.out.println("========================================\n");
			
	}
	
	public void AvrageSalEmployee(Employee a[]) {
		 double Total=0;
		 double GetASal=0;
		for(int i=0; i<a.length; i++) {
			Total+=a[i].getBasicSal();
			
		}
		
		
	}
	
}
