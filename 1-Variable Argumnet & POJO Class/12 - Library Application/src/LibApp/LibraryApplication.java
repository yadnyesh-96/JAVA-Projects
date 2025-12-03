package LibApp;
import java.util.*;

public class LibraryApplication {
	public static void main(String x[]) {
		Scanner sc=new Scanner (System.in);
		
		LibFunctionality f=new LibFunctionality();
		
		System.out.println("======  Books Library Management System  =======\n\n");
		
		do {
		System.out.println("-------- The Menue is  --------\n");
		System.out.printf("1. Add Book Details.\r\n"
				        + "2. Display All Book Details.\r\n"
				        + "3. Display List of all book of given author.\r\n"
				        + "4. Display list the title of specified book.\r\n"
				        + "5. Display list count of the book in the library.\r\n"
				        + "6. Display list the books in the ascending order of accession number.\r\n"
				        + "7. Update book details by title of book.\r\n"
				        + "8. Delete book details by price.\r\n"
				        + "9. Display the price range between 100 to 500.\r\n"
				        + "10. Exit The Code.");
			System.out.println("------------------------------------------------");
		System.out.println();
		System.out.print("Please select an option (1–10): ");
		int choice=sc.nextInt();
		sc.nextLine();
		
		switch (choice) {
				
				case 1: f.AddBooks();
						break;
					
				case 2: f.DisplayBooks();
						break;
					
				case 3: f.SearchAuthorsBook();
				 		break; 
				 		
				case 4: f.TitleBookInfo();
						break;
					
				case 5: f.DisplayTotalBook();
						break;
					
				case 6: f.DisplayBooksAscendingOrder();
						break;
					
				case 7: f.UpdateBookDetail();
						break;
					
				case 8: f.DeleteTheBook();
						break;
					
				case 9: f.DisplaySpecifPriceBook();
						break;
				
				case 10: System.out.println("Exiting the Library System... Goodbye!"); 
						 System.exit(0);
						 break;
					
				default:
						System.out.println("Invalid Input please try Agian !");
		}
		System.out.println();
		
		}while(true);
		
	}
}
