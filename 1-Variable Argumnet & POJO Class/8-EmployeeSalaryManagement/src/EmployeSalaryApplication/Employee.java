package EmployeSalaryApplication;

class Employee {
	
	//empId, name, basicSalary, hra, and da
	
	private int empId,hra,da;
	private double basicSalary;
	private String name;
	
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public int getEmpId() {
		return empId;
	}
	
	public void setHra(int hra) {
		this.hra=hra;
	}
	public int getHra() {
		return hra;
	}
	
	public void setDa(int da) {
		this.da=da;
	}
	public int getDa() {
		return da;
	}
	
	public void setBasicSal(double sal) {
		basicSalary=sal;
	}
	public double getBasicSal() {
		return basicSalary;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void DisplayDetails() {
	
	//	System.out.println("\nId: "+empId+"\nName: "+name+"\nBasic Salary: "+basicSalary+"\nHRA: "+hra+"\nDA: "+da);
		double sum=hra+da+basicSalary;
		System.out.printf("%-5d %-15s %-15.2f %-10d %-10d %-10.2f\n", empId, name, basicSalary, hra, da, sum);
	}
}
