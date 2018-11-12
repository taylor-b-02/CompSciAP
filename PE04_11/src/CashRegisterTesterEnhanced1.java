public class CashRegisterTesterEnhanced1 {
	
	public static void main(String[] args) {
		
		CashRegisterEnhanced1 register = new CashRegisterEnhanced1();
		
		register.recordPurchase(20.37);
		register.enterDollars(20);
		register.enterQuarters(2);
		System.out.print("Change: ");
		System.out.println(register.giveChange());
		System.out.println("Expected: 0.13");
		
   }
}
