
public class CashRegisterTester {

	public static void main(String[] args) {
		
		final double NICKEL_VALUE = 0.05;
		final double DIME_VALUE = 0.10;
		final double QUARTER_VALUE = 0.25;
		final double PENNY_VALUE = 0.01;
		
		CashRegister cashMonny= new CashRegister();
		cashMonny.recordPurchase(99.99);
		cashMonny.enterPayment(99, new Currency(1.0, "Dollar"));
		cashMonny.enterPayment(3, new Currency(QUARTER_VALUE, "Quarter"));
		cashMonny.enterPayment(2, new Currency(DIME_VALUE, "Dime"));
		cashMonny.enterPayment(4, new Currency(PENNY_VALUE, "Penny"));
		
		int count = cashMonny.giveChange(new Currency(1, "Dollar"));
		System.out.println("# of Dollars: " + count);
		
		count = cashMonny.giveChange(new Currency(QUARTER_VALUE, "Quarter"));
		System.out.println("# of Quarters: " + count);
		
		count = cashMonny.giveChange(new Currency(DIME_VALUE, "Dime"));
		System.out.println("# of Dimes: " + count);
		
		count = cashMonny.giveChange(new Currency(PENNY_VALUE, "Penny"));
		System.out.println("# of Pennies: " + count);

	}

}
