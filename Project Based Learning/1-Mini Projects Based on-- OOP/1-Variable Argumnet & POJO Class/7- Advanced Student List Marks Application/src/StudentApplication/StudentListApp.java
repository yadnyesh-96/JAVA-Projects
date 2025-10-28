package StudentApplication;
/*
 Q1. Problem:
Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). 
Store data for 5 students using an array of objects. Perform the following operations:
Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks < 35).
Explanation:
This problem tests array of objects, iteration inside objects, and conditional checks.
 You practice object encapsulation (POJO) and multiple computations.
 */


import java.util.*;
public class StudentListApp {
	
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How Student You Have ? :");
		int n=sc.nextInt();
		
		operation op=new operation();
		
		Student s1[]=new Student[n];
		op.TakeInput(s1);
		
		for(int i=0; i<s1.length; i++) {
			s1[i]=new Student();
			
			
			System.out.println("Enter the Name of Student:");
			String nm=sc.nextLine();
			s1[i].setName(nm);
			
			// Here we fix the how many subjects we want to add 
			System.out.println("How many Subjects ? :");
			int s=sc.nextInt();
			System.out.println();
			//Here we takes the Subject's 
			System.out.println("Enter the "+s+" Subject's:");
			//here String sub and integer mark array create for the subjects and their marks store 
			
			String[] sub=new String[s];
			int[] Mark=new int[s];

			for(int j=0; j<sub.length; j++) {
				System.out.println("Enter "+(j+1)+" subject : ");
				sub[j]=sc.next();
				System.out.println("Enter "+(j+1)+" subject Marks");
				
			}
			
			
			
			
			
			sc.nextLine();
		}
	}
}
