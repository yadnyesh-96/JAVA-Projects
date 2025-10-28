package LibApp;
import java.util.*;
public class LibFunctionality {
	Scanner sc=new Scanner(System.in);
	Library L[];
	
	
	//Designed the common Table header interface 
	void TableHeader() {
		System.out.println("------------------------------------------------------------");
        System.out.printf("| %-7s | %-20s | %-15s | %-7s |\n", "Book ID", "Title", "Author", "Price");
        System.out.println("------------------------------------------------------------");
	}
	
	// For The Addition of new Book in Library 
	void AddBooks() {
		
		System.out.println("Add the New Books in Library ");
		System.out.println("How many Books you want to add ? :");
		int n=sc.nextInt();
		L=new Library[n];
		
		for(int i=0; i<L.length; i++) {
			 L[i]=new Library();
			 
			 //Accept the Book id here 
			 System.out.println("Enetr the Book id:");
			 int id=sc.nextInt();
			 L[i].setBid(id);
			 
			 sc.nextLine(); // consume newline
			 
			 //Accept the book Title 
			 System.out.println("Enetr the Book Title:");
			 String title=sc.nextLine();
			 L[i].setBtitle(title);
			 
			 //Accept the Author name here
			 System.out.println("Enter the Book Author name:");
			 String author=sc.nextLine();
			 L[i].setAuthorName(author);
			 
			 //Accept the Book Price 
			 System.out.println("Enetr the Price of Book:");
			 double price=sc.nextDouble();
			 L[i].setBprice(price);
			 
			 sc.nextLine();			
		}
		
		System.out.println("Books Added Successfuly ");
	}
		
	
	
	// To Display the All books in Library
	void DisplayBooks() {
		
		 if (L == null || L.length == 0) {
	            System.out.println("No books available in the library!");
	            return;
	        }
		 // print the Table header here 
		 TableHeader();
		 
	        for (int i = 0; i < L.length; i++) {
	            System.out.printf("| %-7d | %-20s | %-15s | %-7.2f |\n",
	                    L[i].getBid(),
	                    L[i].getBtitle(),
	                    L[i].getAuthorName(),
	                    L[i].getBprice());
	        }

	        System.out.println("------------------------------------------------------------");
	}
	
	
	
	//Display List of all book of given author.
	void SearchAuthorsBook() {
		
		if(L==null || L.length==0) {
			System.out.println("No books Available in the Library !");
			return;
		}
		//Accept the input from user of the Author name to check in the database 
		System.out.println("Enter the Author Name to Search thier Books: ");
		String AuthorName=sc.nextLine();
		
		//print the table header here 
		TableHeader();
		
		boolean flag=false;
		
		
		for(int i=0; i<L.length; i++) {
			// check the book is available in the our Database  or not 
			if(L[i].getAuthorName().equalsIgnoreCase(AuthorName)) {
				System.out.printf("| %-7d | %-20s | %-15s | %-7.2f |\n",
	                    L[i].getBid(),
	                    L[i].getBtitle(),
	                    L[i].getAuthorName(),
	                    L[i].getBprice());
						flag=true;
			}
		}
		
		if(!flag) {
			System.out.println("No Books are available of Given Author Name: "+AuthorName);
		}
		System.out.println("------------------------------------------------------------");
	}
	
	
	// Display list the title of specified book.
	void TitleBookInfo() {
		
		if(L==null || L.length==0) {
			System.out.println("No Books Available in the Library !");
			return;
		}
		
		// Accept the Title name from user first then we go to next 
		System.out.println("Enter the Title of the Book : ");
		String Title=sc.nextLine().trim();
		
		boolean found=false;
		TableHeader();
		
		for(int i=0; i<L.length; i++) {
			
			if(L[i].getBtitle().equalsIgnoreCase(Title)) {
				System.out.printf("| %-7d | %-20s | %-15s | %-7.2f |\n",
						L[i].getBid(),
						L[i].getBtitle(),
						L[i].getAuthorName(),
						L[i].getBprice());
				found=true;
			}
		}
		
		if(!found){
			System.out.println("There is no Book Found of Title is: "+Title);
		}
		System.out.println("------------------------------------------------------------");
	}
	
	//Display list count of the book in the library.
	void DisplayTotalBook() {
		if(L==null||L.length==0) {
			System.out.println("No Books Available in the Library !");
			return;
		}else {
			System.out.println("Total Books Available in the Library :"+L.length);
		}
	}
	
	//Display list the books in the ascending order of accession number.
	void DisplayBooksAscendingOrder() {
		
		// We are the sorting here
		for(int i=0; i<L.length; i++) {
			for(int j=i+1; j<L.length; j++) {
				if(L[i].getBid()>L[j].getBid()) {
					Library Temp=L[i];
					L[i]=L[j];
					L[j]=Temp;
				}
			}
		}
		
		// Print the sorting/ Ascending order the Books Details
		System.out.println("Books sorted in ascending order by Book ID:\\n");
		TableHeader();
		for(int i=0; i<L.length; i++) {
			
		        System.out.printf("| %-7d | %-20s | %-15s | %-7.2f |\n",
		                L[i].getBid(),
		                L[i].getBtitle(),
		                L[i].getAuthorName(),
		                L[i].getBprice());
		    
		}
		System.out.println("------------------------------------------------------------");
	}

	//Update book details by title of book.
	void UpdateBookDetail() {
		if(L==null||L.length==0) {
			System.out.println("There is no books abvailable in the Library !");
			return;
		}
		
		System.out.println("Enter the Book Title to Update Details :");
		String bookTitle=sc.nextLine().trim();
		
		boolean found=false;
		
		for(int j=0; j<L.length; j++) {
			if(L[j].getBtitle().equalsIgnoreCase(bookTitle)) 
			{
				System.out.println("Enter the Books Id:");
				int id=sc.nextInt();
				L[j].setBid(id);
				
				sc.nextLine();
				
				System.out.println("Enter the Book Title:");
				String title=sc.nextLine();
				L[j].setBtitle(title);
				
				System.out.println("Enetr the Author name: ");
				String Author=sc.nextLine();
				L[j].setAuthorName(Author);
				
				System.out.println("Enter the Price of Book: ");
				double price=sc.nextDouble();
				L[j].setBprice(price);
				
				System.out.println("\n Update Successfully !");
				found =true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("No Book Found With Title: "+bookTitle);
		}else {
			System.out.println("Do you want to see the Updated Book library (Yes/No) :");
			String ans=sc.nextLine().trim();
			if(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y")) {
				TableHeader();
				for(int i=0; i<L.length; i++) {
					System.out.printf("| %-7d | %-20s | %-15s | %-7.2f |\n",
		                    L[i].getBid(),
		                    L[i].getBtitle(),
		                    L[i].getAuthorName(),
		                    L[i].getBprice());
		        }

		        System.out.println("------------------------------------------------------------");
			}else {
				System.out.println("Exited without displaying updated list.");
			}
		}
	}
	
	//Delete book details by price.
	
	void DeleteTheBook() {
		if(L==null||L.length==0) {
			System.out.println("No books available in the library!");
			return;
		}
		
		System.out.println("Enter the price Which book you want to delete : ");
		double price=sc.nextDouble();
		
		
		int count=0;
		boolean found=false;
		for(int i=0; i<L.length; i++ ) {
			if(L[i].getBprice()!=price) {
					count++;
			}else {
				found=true;
			}
			
		}
		
		if(!found) {
			System.out.println("No book found with price: " + price);
	        return;
		}
		
		Library[] NewL=new Library[count];
		int ind=0;
		for(int j=0; j<L.length; j++) {
			if(L[j].getBprice()!=price) {
				NewL[ind++]=L[j];
			}
		}
		
		L=NewL;
		System.out.println("Book(s) with price " + price + " deleted successfully!");
		System.out.println("Do you want to view the Updated list of Library (Yes/No) : ?");
		String ans=sc.nextLine().trim();
		
		if(ans.equalsIgnoreCase("yes")||ans.equalsIgnoreCase("y")) {
			TableHeader();
			for(int i=0; i<L.length; i++) {
				System.out.printf("| %-7d | %-20s | %-15s | %-7.2f |\n",
	                    L[i].getBid(),
	                    L[i].getBtitle(),
	                    L[i].getAuthorName(),
	                    L[i].getBprice());
	        }

	        System.out.println("------------------------------------------------------------");
		}else {
			System.out.println("Exited without displaying updated list.");
		}
	}
	
	
	//Display the price range between 100 to 500.
	void DisplaySpecifPriceBook() {
		if(L==null||L.length==0) {
			System.out.println("No books available in the library!");
			return;
		}
		
		System.out.printf("\n \n1.100 <- -> 200 \n2.200 <- ->300 \n3.300 <- ->400 \n4.400 <- ->500 \n5. -->500");
		
		System.out.println("\nPrice Range Options:  \n");
		System.out.println("Select the Price Filter between(1-5) you want to book :");
		int choice=sc.nextInt();
		
		double priceSegments_1=0,priceSegments_2=0;
		
		switch (choice) {
			case 1: priceSegments_1=100;
					priceSegments_2=200;
					break;
				
			case 2: priceSegments_1=200;
					priceSegments_2=300;
					break;
				
			case 3:	priceSegments_1=300;
					priceSegments_2=400;
					break;
				
			case 4:	priceSegments_1=400;
					priceSegments_2=500;
					break;
			
			case 5: priceSegments_1=500;
					priceSegments_2=2000;
					break;
				
			default:
				System.out.println("Invalid Input !");
				return;
				
		}
			
		TableHeader();
		boolean found=false;
		for(int i=0; i<L.length; i++) {
			double price = L[i].getBprice();
			if(price<=priceSegments_1 && price>=priceSegments_2){
				System.out.printf("| %-7d | %-20s | %-15s | %-7.2f |\n",
	                    L[i].getBid(),
	                    L[i].getBtitle(),
	                    L[i].getAuthorName(),
	                    L[i].getBprice());
						found=true;
			}
		}
		System.out.println("------------------------------------------------------------");

	    if (!found) {
	        System.out.println("No books found in the selected price range!");
	    }
		
	}

	
}
