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
			System.out.println("5.SEARCH data from Stack");
			System.out.println("6.VIEW data from Stack");
			System.out.println("7. EXIT ... ");
			System.out.println("\n\nEnter your choice:");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1:
					System.out.println("Eneter the element to push from Stack :");
					int data=sc.nextInt();
					st.push(data);
				break;
			
			case 2:
					
						Object obj=st.pop();
					
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
					if(found!=-1) {
						System.out.println("Data is found in Stack: "+found);
					}else {
						System.out.println("Data is not Found !");
					}
				break;
				
			case 6:
					Iterator i=st.iterator();
					while(i.hasNext()) {
						Object obj1=i.next();
						System.out.print(obj1+" ");
					}
					System.out.println("\n");
				break;
				
			case 7:
					System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Input choose another one ");
				
			}
		}while(true);

	}

}
