
//CS110, Tushar Asthana 
//This program generates 5 subtractions problems within the user decided range,
//formatting questions for a positive outcome, and returns a message dependent on score. 


import java.util.Scanner; // Import Scanner for User Input
import java.util.Random;  // Import Random Number Generator 

public class Subtraction 

{
   public static void main(String [] args)
   
   {
      
      int min;
      int max;
      
      
      System.out.print("Welcome to the Subtraction Tutor!\n" + 
      "You will supply a low value and high value, defining the range of values to be included\n" +
       "in your quiz. You will get 5 problems.\nThe values must be positive and no larger than 9999.\n\n");
       
      //Create Scanner keyboard
      Scanner keyboard = new Scanner(System.in);
      
      //User Input
      System.out.print("Low Value? (>1) :"); 
      min = keyboard.nextInt();
      
      //User Input
      System.out.print("High Value? (<9999) :"); 
      max = keyboard.nextInt();
      
      //score variable 
      int score = 0;
      
      // Validation Loop for Checking the User Input 
      while(min < 1 || max > 9999)
      {
         System.out.println("Please input values between the ranges of 0 and 10000");
         
         //User Input
         System.out.print("Low Value? (>1) :"); 
         min = keyboard.nextInt();
      
         //User Input
         System.out.print("High Value? (<9999) :"); 
         max = keyboard.nextInt();
      }
      
      
      //validation while loop to make sure numbers are in range 
      while(min >= 1 && max <= 9999)
      {
         ///ask 5 subtraction questions 
         for(int i = 0; i < 5; i++)
         {
            //generate two random numbers 
            Random rand = new Random();
            int num = rand.nextInt(max-min) + min;
            int num2 = rand. nextInt(max-min)+ min;
            //variables for big and small values 
            int big = 0;
            int small = 0;
            
            //assign the bigger number to big and smaller to small
            if(num > num2)
            {
               big = num;
               small = num2;
            }
            
            if(num < num2)
            {
               big = num2;
               small = num;
            }
            
            if(num == num2)
            {
               big = num + 1;
               small = num2;
            }
            
            // ask user the question 
            System.out.println( big + " - " + small + 
            "\n------");
            
            // input 
            System.out.print("Answer:");
            int answer = keyboard.nextInt();
            
            // check answer 
            if(answer == (big - small))
            {
               //increment score if correct
               score = score + 1; 
               System.out.println("Correct!\n"); 
            }
               else
               {
                  System.out.println("Incorrect! The answer is" + " " + (big - small) + ".");
               }
                        
            //if at 5 runs total 
            if(i == 4)
            {
               // return results 
               if(score == 5)
            {
                  //print results 
                  System.out.println("\nExcellent! You got all 5 correct!");
            }
               else if(score == 4)
            {
                  // print results
                  System.out.println("\nSo close! You got 4/5 correct!");
            }
               else if(score == 3)
            {
                  // print results
                  System.out.println("\nGood! You got 3/5 correct!");
            }
               else if (score == 2)
            {
                  //print results 
                  System.out.println("\nYou got 2/5 correct. Practice makes perfect!");
            }
               
               else if (score == 1)
            {
                  //print results 
                  System.out.println("\nYou got 1/5 correct. Practice, practice, practice!");
            }
               else if (score == 0)
            {
                  // print results 
                  System.out.println("\nYou got 0/5 correct. You need more practice!");
            }
            
            // end while loop
            min = 0;
           
            }
            
         }
        }     
      
      
  }
}
      


