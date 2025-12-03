package EmployeSalaryApplication;

import java.util.*;
public class SetEmployee {
	private Employee Em[];
	
	Scanner sc=new Scanner(System.in);
	
	public void AcceptsEmployee(int no) {
		Em = new Employee[no];
		
		for(int i=0; i<Em.length; i++) {
			Em[i]=new Employee();

			//set id manually 
			Em[i].setEmpId(i+101);
			
			// takes the employee name one by one and set 
			System.out.println("Enter Name of "+(i+101)+" Employee:");
			String nm=sc.nextLine();
			Em[i].setName(nm);
			
			// takes the employee salary 
			System.out.println("Enter Basic Salaray of "+(i+101)+" Employee:");
			double bs=sc.nextDouble();
			Em[i].setBasicSal(bs);
			
			//following takes the employee hra and da .
			System.out.println("Enter the Hra: ");
			int Hra=sc.nextInt();
			Em[i].setHra(Hra);
			
			System.out.println("Enter the da");
			int da=sc.nextInt();
			Em[i].setDa(da);
			
			sc.nextLine();
			
		}
		
		
		}

	public Employee[] RetrunEmployee() {
		return Em;
	}
}	

