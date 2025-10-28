package StudentGradeApp;
/*
 7. Student Grade Evaluation
Task:
 Create a Student class with fields: name, marks, and subject.
 In the main method:
Create a Student object.
Check if the student has passed or failed the subject (passing marks >= 40) and print the result.
Explanation:
 This task involves condition checking and field manipulation.
 */

import java.util.*;
public class StudentGrdApplication {

	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("How Many Student Data You Have Please Enter:");
		int n=sc.nextInt();
		System.out.println();
		
		System.out.println("Enter the Detail of Students:");
		Student s1[]=new Student[n];
		
		 for(int i=0; i<s1.length; i++) {
			
			 s1[i]=new Student();
			 
			 System.out.println("Enter the Name of Student:");
			 String nm=sc.next();
			 s1[i].setName(nm);
			 
			 
			 System.out.println("Enter the Number of Subject:");
			 int sn=sc.nextInt();
			 String sub[]=new String[sn];
			 int mark[]=new int[sn];
			 
			 for(int s=0; s<sub.length; s++) {
				 System.out.println("Enter "+(s+1)+" Subject Name :");
				 sub[s]=sc.next();			 
				 System.out.println("Enter "+(s+1)+" Subject Marks :");
				 mark[s]=sc.nextInt();
			 }
			 s1[i].setSubject(sub);
			 s1[i].setMarks(mark);
			
			 
		 }
		 
		 for(Student st:s1) {
			 st.Display();
		 }
		 
		 
		 
		 
		 
		 System.out.println();
		 System.out.println();
		
	 }
		
	
		
		
}

