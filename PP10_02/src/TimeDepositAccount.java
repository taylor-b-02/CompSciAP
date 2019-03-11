
public class TimeDepositAccount extends BankAccount{
	
	public TimeDepositAccount(double ainterest, int amonths) {
		interest = ainterest / 100.0;
		months = amonths;
	}
	
	public void addInterest() {
		months -= 1;
		deposit(getBalance() * interest);
	}
	
	public void withdraw(double amount) {
		if (getBalance() > 0) {
			super.withdraw(amount + WITHDRAWAL_FEE);
		}
		else if (months > 0) super.withdraw(amount + WITHDRAWAL_FEE);
	}
	
	public String toString() {
		return
	}
	public final int WITHDRAWAL_FEE = 1;
	int months;
	double interest;
}
