package BankingBalanceApplication;

public class BankAccount {

	private String HolderName;
	private int balance;
	
	public void setHoldersName(String HolderName) {
		this.HolderName=HolderName;
	}
	
	public String getHolderName() {
		return HolderName;
	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	public int getBalance() {
		return balance;
	}
}
