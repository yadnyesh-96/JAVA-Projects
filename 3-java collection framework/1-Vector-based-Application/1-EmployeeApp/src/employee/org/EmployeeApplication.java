package employee.org;
import java.util.*;
public class EmployeeApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Vector v=new Vector();
		
		Employee e1=new Employee(1,"ABC",15000);
		Employee e2=new Employee(2,"MNO",18000);
		Employee e3=new Employee(3,"PQR",17500);
		Employee e4=new Employee(4,"STU",15260);
		Employee e5=new Employee(5,"VWX",12470);
		Employee e6=new Employee(6,"OOP",11290);
		
		v.add(e1);
		v.add(e2);
		v.add(e3);
		v.add(e4);
		v.add(e5);
		v.add(e6);
		
		System.out.print("ID\tName\tSalary\n");
		Iterator i=v.iterator();
		
		while(i.hasNext()) {
			Object obj=i.next();
			Employee e=(Employee)obj;
			System.out.print(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()+"\n");
		}
		


	}

}
