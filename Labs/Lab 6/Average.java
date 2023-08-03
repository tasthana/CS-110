

import java.util.Scanner;     // Needed for the Scanner class
import java.util.ArrayList;   // Needed for ArrayList class

 
public class Average

{

    private double mean;  //variable that will reference the average of the scores.
    private int [] data;  //variable that will reference an array of test scores.
    int NUM_SCORES = 5;    //the class constant 

    /**

        The constructor copies the elements in an array to the data array
        @param 

    */
    public Average()

    {
        //Create an array referenced by data with 5 elements.
        data = new int[5];

        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in); 

        //Read the test scores into the array
        //get user data, but i couldnt figure it out 
        for (int index = 0; index < NUM_SCORES; index++)
                
            {
               System.out.print("Enter your score for test #" + (index +1) + ": ");
               data[index] = keyboard.nextInt();

            //Call the toString method

            toString(data[index]);

            }      

    }

    /**

        getTotal method

        @ return The total number of test scores in the data array

    */

    public double getTotal()

    {

        double total = 0; //Accumulator

     

        //Accumulate the sum of the test scores in the data array.

        for (int index = 0; index < NUM_SCORES; index++)

            total += data[index];

             

        //Return total

        return total;

    }

   //math function to calculate mean 
    public double calculateMean()
    {
        return getTotal() / data.length;
    }

    /**

        The toString method returns a String containing data in

        descending order and the mean.

    */

    public toString(int s)

    {  
        System.out.println("The values are:");

          for (int i = 0; i < data.length; i++)

        System.out.print(data[i] + " ");

            System.out.println();  

        System.out.println(calculateMean());

    }

 }  
