package org.ArrayList;
import java.util.*;
public class ArrayListApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Case 1: Add New element 
//		Case 2: View all elements
//		Case 3: Search element in ArrayList
//		Case 4: delete element from ArrayList 
//		Case 5: check the size of ArrayList 
//		Case 6: retrieve data from ArrayList 
		
		ArrayList al=new ArrayList();
		
		do {
			System.out.println("1.Add new element ");
			System.out.println("2.View All elements");
			System.out.println("3.Search element in ArrayList");
			System.out.println("4.Delete element from ArrayList");
			System.out.println("5.Check the size of ArrayList");
			System.out.println("6.Retrive data from ArrayList");
			
			int choice =sc.nextInt();
			
		} while (true);
		
	}

}
