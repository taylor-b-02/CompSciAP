public class CashRegisterTesterEnhanced3 {
	
	public static void main(String[] args) {
		
		CashRegisterEnhanced3 register = new CashRegisterEnhanced3();
		
		//Purchase of $8.59 recorded
		register.recordPurchase(8.59);
		
		//Payment of 10 dollars given
		register.enterPayment(10, 0, 0, 0, 0);
		
		//Prints expected dollars
		System.out.println("Dollars: " + register.giveDollars());
		//Expected: 1
		//Prints expected quarters
	 	System.out.println("Quarters: " + register.giveQuarters());
	 	//Expected: 1
	 	//Prints expected dimes
		System.out.println("Dimes: " + register.giveDimes());
		//Expected: 1
		//Prints expected nickels
		System.out.println("Nickels: " + register.giveNickels());
		//Expected: 1
		//Prints expected pennies
		System.out.println("Pennies: " + register.givePennies());
		//Expected: 1
		
   }
}
