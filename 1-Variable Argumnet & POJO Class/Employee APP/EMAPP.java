import java.util.*;

class Employee{
	String name;
	int id;
	double sal;
	
	void setName(String name){
		this.name=name;
	}	
	String getName(){
		return name;
	}
	void setId(int id){
		this.id=id;
	}
	int getId(){
		return id;
	}
	void setSal(double sal){
		this.sal=sal;
	}
	double getSal(){
		return sal;
	}
} 

public class EMAPP{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter How many Employee :");
		int size=sc.nextInt();
		
		Employee[] e=new Employee[size];
		
		for(int i=0; i<e.length; i++){
			e[i]=new Employee();

			e[i].setId(i+1);
			
			System.out.println("Employee Name:");
			String name=sc.next();
			e[i].setName(name);
			
			System.out.println("Salary of Employee:");
			double sal=sc.nextDouble();
			e[i].setSal(sal);
			
		}
		
		System.out.println("Employee Details:");
		System.out.println("ID\tNAME\t\tSALARY");
		for(int i=0; i<e.length; i++){
			System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t\t"+e[i].getSal());
		}
		
	}
}