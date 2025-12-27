package org.Stack;
import java.util.*;
public class StackApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Stack st=new Stack();
		
		do {
			System.out.println("----------------------");
			System.out.println("1.PUSH Data in Stack");
			System.out.println("2.POP/REMOVE data from Stack");
			System.out.println("3.SIZE of Stack");
			System.out.println("4.PEEK data from Stack");
			System.out.println("4.SEARCH data from Stack");
			System.out.println("5. EXIT ... ");
			System.out.println("\n\nEnter your choice:");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1:
					System.out.println("Eneter the element to push on stack:");
					int data=sc.nextInt();
					st.push(data);
				break;
			
			case 2:
				break;
				
			case 3:
				break;
			
			case 4:
				break;
				
			case 5:
				break;
				
			default:
				System.out.println("Invalid Input choose another one ");
				
			}
		}while(true);

	}

}
