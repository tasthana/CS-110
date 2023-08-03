// Tushar Asthana, CS110 OL1, Assignment 4
/**
This file takes the SavingsAccount class and calls it in the DepositsAndWithdrawals file
*/

// import scanner
import java.util.Scanner;
import java.io.*;
 
// create DepositsAndWithdrawals class
public class DepositsAndWithdrawals
{
   // main function
   public static void main(String[] args) throws IOException
   {  
      //ask for savings out balance
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the saving account's annual interest rate: ");
      double interest = keyboard.nextDouble();
      
      // declare starting balance
      double startingBalance = 500.00;
      
      // initialize savingsAccount class
      SavingsAccount newAccount = new SavingsAccount();
      newAccount.SavingsAccount(startingBalance, interest);
      
      // startingBalance
      System.out.printf("Starting Balance: $" + newAccount.getBalance() + "\n", "%.2d");
    
   
      // open deposits.txt file
      File myFile = new File("Deposits.txt");
      Scanner depositsFile = new Scanner(myFile);
      
      // while loop to keep reading file
      while (depositsFile.hasNext())
      {
         // read file and define 
         double number = depositsFile.nextDouble();
         newAccount.deposit(number);
         System.out.printf("Deposit: $" + number + ", balance = $" + newAccount.getBalance() + "\n", "%.2d", "%.2d");  
      }
      
      // close numbers.txt file
      depositsFile.close();
      
      // open withdraws.txt file
      File myFile2 = new File("Withdraws.txt");
      Scanner withdrawsFile = new Scanner(myFile2);
      
      // while loop to keep reading file
      while (withdrawsFile.hasNext())
      {
         // read file and define 
         double number = withdrawsFile.nextDouble();
         newAccount.withdraw(number);
         System.out.printf("Withdraw: $" + number + ", balance = $" + newAccount.getBalance() + "\n", "%.2d", "%.2d");  
      }
      
      // close numbers.txt file
      withdrawsFile.close();
      
      // print interest earned
      newAccount.addInterest();
      System.out.printf("Interest earned: $" + newAccount.getLastInterest() + "\n", "%.2d");
      
      // print ending balance
      newAccount.getBalance();
      System.out.printf("Ending balance: $" + newAccount.getBalance() + "\n", "%.2d");
   }
}

