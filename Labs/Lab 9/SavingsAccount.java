public class SavingsAccount extends BankAccount
{
   private double rate = 2.5;
   private int savingsNumber = 0;
   private String accountNumber;
   public SavingsAccount(String name, double initialAmount)
   {
      super(name,initialAmount);
      accountNumber = super.getAccountNumber() + "_" + savingsNumber;
   }
   public void postInterest()
   {
      setBalance(getBalance()*(1+rate/100/12));
   
   }  
   public String getAccountNumber()
   {
      return accountNumber;
   }
   public SavingsAccount(SavingsAccount old, double newBalance)
   {
      super((BankAccount)old, newBalance);
      savingsNumber += 1;
      accountNumber = super.getAccountNumber() + "_" + savingsNumber;
   }
   

}