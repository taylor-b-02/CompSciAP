/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
   private double balance;
   private double fee;
   private double freeTrans;
   private double totalTrans;
   private double paidTrans;

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      if ( (totalTrans - freeTrans) > 0) {
    	  balance = (balance + amount);
    	  paidTrans += 1;
    	  totalTrans +=1;
      }
      else {
    	  balance = (balance + amount); 
    	  totalTrans +=1;
      }
	   
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
	   if ( (totalTrans - freeTrans) > 0) {
	    	  balance = (balance - amount);
	    	  paidTrans += 1;
	    	  totalTrans +=1;
	      }
	      else {
	    	  balance = (balance - amount); 
	    	  totalTrans +=1;
	      }
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
   
   public void setFee(double amount)
   {
	   fee = amount;
   }
   
   public void setTrans(int amount)
   {
	   freeTrans = amount;
   }
   
   public void deductMonthlyCharge()
   {
	   balance -= (paidTrans * fee);
	   paidTrans = 0;
	   totalTrans = 0;
	   
   }
}
