//CS110 OL1, Tushar Asthana, Assignment 9  

import java.util.Scanner; 

public class FileDriver

{
    /**
     * @param String x
     * function to find whether the string passed is integer or not
     * and return the integer value of x if it is integer else return 0
     * @return int value of x 
     */
     
    public static int isInteger(String x)

    {
        if(x.charAt(0) != '-' && Character.isDigit(x.charAt(0)) == false)
        {
            return 0;
        }

        for(int i = 1; i < x.length(); i++)
        {
            if(Character.isDigit(x.charAt(i)) == false)
            {
                return 0;
            }
        }
        return Integer.parseInt(x);
    }

   /**
   * this function will take user input, validate it using while, if-else loops, 
   * read,sort, and write file to array, do a binary search, and provide output
   */
    public static void main(String[] args)
    {
        // declare variables 
        String fileName;
        String number;
        
        // scanner to take take input
        Scanner read = new Scanner(System.in);

        // user input
        System.out.print("Enter the name of file: ");
        fileName = read.nextLine();

        // asking the user for number of names to read from file
        System.out.print("How many names would you like to search through? ");
        number = read.nextLine();
        
        // validation
        while(isInteger(number) == 0)
        {
            System.out.println(number+" is not an integer");
            System.out.println("Enter a positive integer value");
            number = read.nextLine();
        }

        while(isInteger(number) < 0)
        {
            System.out.println("Enter a positive integer value");
            number = read.nextLine();
        }

        // if number of names is valid then storing it in nameCount and creating the array
        int nameCount = Integer.parseInt(number);
        String[] nameArray = new String[nameCount];

        // calling the readArray() function to read the file
        int numNames = ArrayFunctions.readArray(fileName, nameArray);

        // sorting the array read from the file
        ArrayFunctions.selectionSort(nameArray, numNames);

        // wrtiting the sorted data to the file as required
        if(ArrayFunctions.writeArray("sorted_"+fileName, nameArray) == false)
        {
            System.out.println("write was unsuccessful");
        }

        // asking the user to enter name to search from the array
        System.out.print("\nEnter the name to search: ");
        String name = read.nextLine();

        // using binarySearch() function to search the name location 
        int index = ArrayFunctions.binarySearch(nameArray, 0, numNames-1, name);

        // printing the message according to the value returned by the binarySearch() functio
        if(index == -1)
        {
            System.out.println(name + " was not in the list of "+numNames);
        }

        else
        {
            System.out.println(name + " was "+(index+1)+" on the list");
        }
        
        read.close();
    }
}