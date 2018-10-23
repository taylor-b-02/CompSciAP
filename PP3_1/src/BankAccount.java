import java.time.*;
import java.time.format.DateTimeFormatter;

public class BankAccount {
	
	private double balance;
	private double fee;
	private int transCount = 0;
	private int maxTrans;
	private double monthlyOverage;
	private int monthPrev;
	
	LocalDate localDate = LocalDate.now();
	DateTimeFormatter formats = DateTimeFormatter.ofPattern("YYYYMM");

		
	public BankAccount() {
		balance = 0;
		monthPrev = Integer.parseInt(localDate.format(formats));
	}
	
	public BankAccount(double initialBalance, double initialFee, int initialTrans,
			double initialMonthlyOverage) {
		balance = initialBalance;
		fee = 1 + initialFee;
		maxTrans = initialTrans;
		monthlyOverage = initialMonthlyOverage;
		monthPrev = Integer.parseInt(localDate.format(formats));
	}
	
	public void deposit(double amount) {
		balance += amount - fee;
		checkOver();
	}
	
	private void checkOver() {
		transCount += 1;
		//System.out.println(localDate.format(formats));
		LocalDate newDate = LocalDate.now();
		if (monthPrev == Integer.parseInt(newDate.format(formats))) {
			if (transCount > maxTrans) {
				balance -= monthlyOverage;
				System.out.println("You have went over the monthly limit of transactions"
						+ ", a fee has been applied to your account");
			}
		}
		else {
			transCount = 0;
		}
	}
	
	public void withdrawl(double amount) {
		balance -= amount - fee;
		checkOver();
	}
	
	public double getBalance() {
		return balance;
	}
}