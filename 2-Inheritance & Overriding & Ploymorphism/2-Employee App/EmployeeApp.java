
import java.util.*;
class Employee{
	
	int id;
	String name;
	double baseSalary;
	
	Employee(int id, String name, double baseSalary){
		this.id=id;
		this.name=name;
		this.baseSalary=baseSalary;
	}
	
	double calculatesalary(){
		return baseSalary;
	}
}

class Manager extends Employee{
	
	int TeamSize=0;
	
	Manager(int id, String name, double baseSalary,int TeamSize){
		super(id,name,baseSalary);
		this.TeamSize=TeamSize;
	}
	
	double calculatesalary(){
		double allowance=baseSalary*0.40;
		if(TeamSize>10){
			return baseSalary+allowance+10000;
		}else{
			return baseSalary+allowance;
		}
	}
}
class Developer extends Employee{
	int numberofProjects=0;
	Developer(int id, String name, double baseSalary,int numberofProjects){
		super(id,name,baseSalary);
		this.numberofProjects=numberofProjects;
	}
	
	double calculatesalary(){
		double allowance=baseSalary*0.30;
		double p=numberofProjects*2000;
		return baseSalary+allowance+p;
	}
}
class Intern extends Employee{
	Intern(int id, String name, double baseSalary){
		super(id,name,baseSalary);
	}
	
	double calculatesalary(){
		double allowance=baseSalary*0.50;
		return baseSalary+allowance;
	}
}


public class EmployeeApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("== Store Upto 10 Employee's Data ==\n\n");
		
		Employee em1[]=new Employee[10];
		
		for(int i=0; i<10; i++){
			int Id=i+1;
			System.out.println(Id+"- Enter the Detail's of Employee\n");
			
			System.out.println("A) Manager  B) Developer C) Intern");
			System.out.println("Select the Employee Post:");
			String type=sc.nextLine();
			
			String nm;
			if(type.equalsIgnoreCase("Manager")){
				System.out.println("Enter "+type+" Name: ");
				nm=sc.nextLine();
			}else if(type.equalsIgnoreCase("Developer")){
				System.out.println("Enter "+type+" Name: ");
				nm=sc.nextLine();
			}else{
				System.out.println("Enter "+type+" Name: ");
				nm=sc.nextLine();
			}
			
			System.out.println("Enter Base Salary :");
			double bs=sc.nextDouble();
			sc.nextLine(); //buffer
			
			if(type.equalsIgnoreCase("Manager")){
				System.out.println("Team Size :");
				int team=sc.nextInt();
				
				sc.nextLine(); //buffer
				
				em1[i]=new Manager(Id,nm,bs,team);
			
			}else if(type.equalsIgnoreCase("Developer")){
				System.out.println("Number of Projects :");
				int p=sc.nextInt();
				
				sc.nextLine(); //buffer clear
				em1[i]=new Developer(Id,nm,bs,p);
				
			}else{
				em1[i]=new Intern(Id,nm,bs);
			}
			
		}
		
		double maxSal=0;
		Employee em2=null;
		
		int countAbove60=0;
		for(Employee e:em1){
			double sal=e.calculatesalary();
			
			if(sal>maxSal){
				maxSal=sal;
				em2=e;
			}
			
			if(sal>60000)countAbove60++;
			
			System.out.println("ID 	   :"+e.id);
			System.out.println("Name   :"+e.name);
			System.out.println("Salary :"+sal);
		}
		
		System.out.println("\n===== Employee with Maximum Salary =====");
        System.out.println("Name: " + em2.name);
        System.out.println("Salary: " + maxSal);

        System.out.println("\nEmployees earning above 60,000: " + countAbove60);
		
	}
}