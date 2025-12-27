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
					System.out.println("Eneter the element to push from Stack :");
					int data=sc.nextInt();
					st.push(data);
				break;
			
			case 2:
					System.out.println("Enter the element to POP/REMOVE from Stack :");
					data=sc.nextInt();
					int index =st.search(data);
					if(index!=-1) {
						Object obj=st.pop();
					}
				break;
				
			case 3:
					System.out.println("SIZE of Stack is : "+st.size());
				break;
			
			case 4:
				Object obj=st.peek();
				System.out.println("Peeked Data From Stack :"+obj);
				break;
				
			case 5:
					System.out.println("Eneter element to search from Stack");
					data=sc.nextInt();
					int found=st.search(data);
					
				break;
				
			default:
				System.out.println("Invalid Input choose another one ");
				
			}
		}while(true);

	}

}
