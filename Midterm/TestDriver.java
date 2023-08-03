// Tushar Asthana, CS110 OL1, Midterm Coding Question 1

/** A program to determine if numbers are multiples of each other.  The user will supply values the two values to test.*/

import java.util.Scanner; // adding scanner 


public class TestDriver
{
   public static void main(String [] args)
   {
      
      
      // attach Scanner to keyboard for user input
      Scanner sc = new Scanner(System.in); 
      
      // get first integer value from the user
      System.out.print("First Integer Value : ");
      double intFirst = sc.nextDouble(); 
      sc.nextLine(); 
      
      // get second integer value from the user
      System.out.print("Second Integer Value : ");
      double intSecond = sc.nextDouble(); 

      // send values to method multiples and store result
      TestDriver mm = new TestDriver();
      mm.Multiple(intFirst, intSecond); 
 
      // display the result
      
            
   
   }
   
   /** method multiples takes two integers and returns true if either
       number is a multiple of the other.
       @param num1 first number
       @param num2 second number
       @return true if num1 is a multiple of num2 or num2 is a multiple of num1, false otherwise
             
   */
   public void Multiple(double f, double s)
      {
         if(f % s == 0 || s % f ==0)
         {
            System.out.print("Yes, a multiple was found.");
         }
         else
         {
             System.out.print("No, a multiple was not found.");
         }
      }
}