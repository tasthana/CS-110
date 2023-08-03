

// CS 110, Tushar Asthana 

/**
This program calculates the total price which includes sales tax.
*/

import java.util.Scanner;

public class SalesTax
{
   public static void main(String[] args)
   {
      // Identifier declarations
      final double TAX_RATE = 0.055;
      double price;
      double tax;
      double total;
      String describe;
      String item;
      
      //create scanner 
      Scanner keyboard = new Scanner(System.in);

      // Create a Scanner object to read from the keyboard. Scanner keyboard = new Scanner(System.in);
      // Display prompts and get input. System.out.print("Item description: ");
      System.out.print("Item Description:"); 
      item = keyboard.nextLine();
      System.out.print("Item price: $");
      price = keyboard.nextDouble();
      
      
      // Perform the calculations.
      tax = price * TAX_RATE;
      total = price + tax;
      
      
      // Display the results.
      System.out.printf(item + “%. 2f” " $"); System.out.println(price);
      System.out.printf(“%. 2f” "Tax $");
      System.out.println(tax);
      System.out.printf(“%. 2f”"Total $"); System.out.println(total);
}
}