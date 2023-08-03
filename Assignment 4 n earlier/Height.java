
// CS110, Tushar Asthana 
// Write a program that prompts the user for their name and height in inches.

import java.util.Scanner; // import scanner 


public class Height
{
   public static void main (String [] args)
   {
      //declare variables 
      int inches; 
      int height;
      int foot;
      int remain;
      String name; 
      
      // set up Scanner Keyboard 
      Scanner keyboard = new Scanner(System.in);
      
      //print statement to scan Name
      System.out.print("What is your name? :");
      name = keyboard.nextLine();
      
      //print statement to scan Inches 
      System.out.print("How tall are you in inches?");
      inches = keyboard.nextInt(); 
      
      //math functions 
      foot= inches / 12;
      remain = inches % 12;
      
      //print statement formated output
      System.out.println(name + " " + "is" + " " + foot + " " + "feet" + " , " + remain + " " + "inches tall."); 
    }
}
      
      
      
      
      
      
      