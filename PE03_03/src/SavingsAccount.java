
public class SavingsAccount {
	 double balance;
	 double interest;
	//Constructors
	public SavingsAccount() {
		balance = 0;
		interest = 0;
	}
	
	public SavingsAccount(double initBalance) {
		balance = initBalance;
		interest = 0;
	}
	
	public SavingsAccount(double initBalance, double interestRate) {
		balance = initBalance;
		interest = interestRate;
	}
	
	//Methods
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public double getBalance() {
		return balance;	
	}
	
	public void addInterest() {
		balance = balance + (balance * (interest/100.0));
	}

}
