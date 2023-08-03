

import java.io.*;         // Import File Opener 
import java.util.Scanner; // Import Scanner 

/**
This class reads numbers from a file, calculates the mean and standard deviation, and writes the results to a file.
*/
public class StatsDemo
{
   // TASK #3 Add the throws clause
   public static void main(String[] args)throws IOException
   {
      double sum = 0;    // The sum of the numbers
      int count = 0;     // The number of numbers added
      double mean = 0;   // The average of the numbers
      double stdDev = 0; // The standard deviation
      String line;       // To hold a line from the file
      double difference; // The value and mean difference

       // Create an object of type Scanner
      Scanner keyboard = new Scanner (System.in);
      String filename;   // The user input file name
       
      // Prompt the user and read in the file name 
      System.out.println("This program calculates " + ("statistics on a file ") + ("containing a series of numbers\n"));
      System.out.println("Enter file name :");
      filename = keyboard.nextLine();  
             
      PrintWriter outputFile = new PrintWriter("Results.txt");
      outputFile.println("mean = 0.000");
      outputFile.println("standard deviation = 0.000");
      
      outputFile.close();
      
       // ADD LINES FOR TASK #4 HERE
       
      // Create a File object passing it the filename
      File myFile = new File(filename);
      
      // Create a Scanner object passing File object
      Scanner inputFile = new Scanner(myFile);
      
      // Loop until you are at the end of the file
      while(inputFile.hasNext())
      {
         double number = inputFile.nextDouble();
         sum = sum + number;
         count++;
      }
      
      inputFile.close();
      
      mean = sum / count;
      
        
         // ADD LINES FOR TASK #5 HERE
         // Reconnect File object passing it the filename
         // Reconnect Scanner object passing File object
         // Reinitialize the sum of the numbers
         // Reinitialize the number of numbers added
         // Loop until you are at the end of the file
         // Read a double value
         // Subtract the mean
         // Add the square of the difference to the sum
         // Increment the counter
         // Close the input file
               // Store the calculated standard deviation
         // ADD LINES FOR TASK #3 HERE
         // Create a PrintWriter object using "Results.txt" // Print the results to the output file
         // Close the output file
         } }
         