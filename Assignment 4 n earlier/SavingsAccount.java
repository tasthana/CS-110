// Tushar Asthana, CS110 OL1, Assignment 4
/**
This class will be used in another java file
Will accept starting balance, monthly withdrawals and deposits and calculate interest rate 
*/


// start the class
public class SavingsAccount
{
   // Private variables
   private double balance;    // used for account balance
   private double interestRate;     // used for interest rate 
   private double lastInterest;     // last interest rate
   
   // constructor that takes in balance and interest rate
   public void SavingsAccount(double startingBalance, double startingInterestRate)
   {
      // set balance and interest rate
      balance = startingBalance;
      interestRate = startingInterestRate;
   } 
   
   // withdraw method
   public void withdraw(double amount)
   {
      // subtract amount from balace
      balance = balance - amount;
   }
   
   // deposit method
   public void deposit(double amount)
   {
      balance = balance + amount;
   }  
   
   // addInterest method
   public void addInterest()
   {
      double amount = (interestRate * balance) / 12;
      lastInterest = amount;
      balance = balance + amount;
   }
   
   // getBalance method
   public double getBalance()
   {
      return balance;
   }
   
   // getInterestRate method
   public double getInterestRate()
   {
      return interestRate;
   }
   
   // getLastInterest method
   public double getLastInterest()
   {
      return lastInterest;
   }
}