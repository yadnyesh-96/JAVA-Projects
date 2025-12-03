package BankingBalanceApplication;

import java.util.Scanner;

/*
 10. Bank Account Balance Update
Task:
 Create a BankAccount class with fields: accountHolderName and balance.
 In the main method:
Create a BankAccount object.
Deposit an amount into the account and print the updated balance.
Explanation:
 This introduces updating object fields and performing logical operations.
 */

public class BankBalanceUpdation {

		public static void main(String x[]) {
			Scanner sc=new Scanner(System.in);
			
			BankAccount b1=new BankAccount();
			do {
			System.out.println("Enter the Your Name:");
			String nm=sc.nextLine();
			b1.setHoldersName(nm);
						
			System.out.println();
			
			
			System.out.println("You Want to Deposite the Amount (y/n): ");
			char ans=sc.next().charAt(0);
			
			if(ans == 'y' || ans == 'Y') {
				System.out.println("Account Balance: "+b1.getBalance());
				System.out.println("Enter the Deposit Amount");
				int A=sc.nextInt();
				if(A>=0) {
				b1.setBalance(A);
					System.out.println("Amount Deposited .. ");
				}
				
				System.out.println("Can you View The Account Statment (y/n)");
				char ans1=sc.next().charAt(0);
				if(ans1=='y' || ans1=='Y') {
				System.out.println("Account Statement");
				System.out.println("--------------------------------");
				System.out.println("Holder Name: "+b1.getHolderName());
				System.out.println("Available Balance "+b1.getBalance());
				System.out.println("--------------------------------");
				System.out.println("----------- Thank You ----------");
				}else {
					System.out.println("Thank You");
				}
				
			}else if(ans =='n' || ans =='N') {
				System.out.println("Thank You .. ");
			}else {
				System.out.println("Invalid Input !");
			}
			
			sc.nextLine();
			}while(true);
		}
}
