
public class SavingsAccountTester {
	
	public static void main(String args[]) {
		SavingsAccount bob = new SavingsAccount(1000.0, 10.0);
		bob.addInterest();
		System.out.println(bob.getBalance());
	}
	
}
