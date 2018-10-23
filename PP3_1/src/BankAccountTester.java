public class BankAccountTester {
	public static void main(String []args) {
		BankAccount newAndImproved = new BankAccount(600, 5, 2, 22);
		
		newAndImproved.deposit(200);
		newAndImproved.deposit(200);
		newAndImproved.deposit(200);
		newAndImproved.deposit(200);
		newAndImproved.deposit(200);
		newAndImproved.deposit(200);
		System.out.println(newAndImproved.getBalance());
	}
}