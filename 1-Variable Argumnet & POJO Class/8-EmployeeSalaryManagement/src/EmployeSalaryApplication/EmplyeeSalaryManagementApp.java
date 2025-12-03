package EmployeSalaryApplication;
/*
 *Q2. Problem:
Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da. 
Store details of 5 employees using an array of objects. Perform the following operations:

Calculate the gross salary for each employee (gross = basic + hra + da).
Find and display the employee with the maximum salary.
Print the details of employees whose salary is greater than the average salary of all employees.


Explanation:
This covers aggregation + comparison + filtering. You’ll work with numerical calculations and 
finding max/average values.
 */

import java.util.*;
public class EmplyeeSalaryManagementApp {

	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many Employee you have ?");
		int n=sc.nextInt();
		
		SetEmployee s1=new SetEmployee();
		s1.AcceptsEmployee(n);
		Employee emp[]=s1.RetrunEmployee();
		
		Functionality f1=new Functionality();
		f1.ShowDatabse(emp);
		
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println();
		f1.MaxSalEmployee(emp);
		
	}
	

}
