import java.util.logging.Logger;



/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
	
   public static final double QUARTER_VALUE = 0.25;
   public static final double DIME_VALUE = 0.1;
   public static final double NICKEL_VALUE = 0.05;
   public static final double PENNY_VALUE = 0.01;

   private double purchase;
   private double payment;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
      //Logger.getGlobal().info("amount=" + amount);
   }
   
   public void recordPurchase(int count, Currency coin)
   {
      purchase += count * coin.getValue();
      //Logger.getGlobal().info("amount=" + count * coin.getValue());
   }
   
   /**
      Enters the payment received from the customer.
      @param dollars the number of dollars in the payment
      @param quarters the number of quarters in the payment
      @param dimes the number of dimes in the payment
      @param nickels the number of nickels in the payment
      @param pennies the number of pennies in the payment
   */
   /**public void enterPayment(int dollars, int quarters, 
         int dimes, int nickels, int pennies)
   {
      payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
            + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
   }
   */
   
   public void enterPayment(int coinCount, Currency coin) {
	   payment += coin.getValue() * coinCount;
	   
   }
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   /**public double giveChange()
   {
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }
   */
   
   public int giveChange(Currency coinType)
   {
	   //System.out.println(payment);
	   int count = (int) ( payment / coinType.getValue() );
	   //System.out.println(payment);
	   payment -= count * coinType.getValue();
      return count;
   }
}
