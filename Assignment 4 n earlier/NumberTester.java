//CS110 L1, Assignment 3, Tushar Asthana 

import java.io.*;         //import file reader/writer
import java.util.Scanner; //import scanner 
 
public class NumberTester
{
  
   public static void main(String[] args)throws IOException //Exception Handling 
   
   {
      boolean prime, even, repeatDigits ; //put in booelean values 
      
      
      File myFile = new File ("numbers.txt");                        //open file 
      Scanner inputFile = new Scanner(myFile);                       //read in file 
      PrintWriter outputFile = new PrintWriter("numberSummary.txt"); // create Printer to create new type file
      
      
      outputFile.println("       Repeat");                                                   //print first line 
      outputFile.print("Number" + " " + "Digits" + "   "  + "Even" + "  " + "Prime" + '\n'); //print second line 
      
      
      //while loop to read file and send values to new functions to return 
      while (inputFile.hasNext())
      {
         String Num = inputFile.nextLine(); 
         int newNum = Integer.valueOf(Num);
         if(Num.length() == 3){
            outputFile.print(" " + Num + "      " + isRepeatedDigits(newNum) + "      " + isEven(newNum) + "       " + isPrime(newNum) + '\n');
         }
         
         else{
            outputFile.print("  " + Num + "      " + isRepeatedDigits(newNum) + "      " + isEven(newNum) + "       " + isPrime(newNum) + '\n');
         }
         
      }      
      
    inputFile.close();  //close input file 
    outputFile.close(); //close output file 
    }
    
    /**
      @param int number based on prime
      @return character symbol to main
    */
    
    public static String isPrime(int number){ 
      // n variable 
      int n = number; 
      // check to see if number is prime 
      for(int i = 2; i < n; i++){
         // if not prime return "-"
         if(n % i == 0)
            return "-";
         }
      return "+";
    }
    
    /**
      @param int number based on even function
      @return character symbol to main
    */
    
    public static String isEven(int number){ //isEven function, returns to main 
    
      // if number % 2 == 0 return "+"
      if(number % 2 == 0){
         return "+";
      }
     
      // if number is not even release false 
      return "-";
    }
    
    /**
      @param int number based on repeated digits
      @return character symbol to main
    */
    
    public static String isRepeatedDigits(int number){ //isRepeatedDigits, returns to main 
      //turn number into string 
      String stringNumber = "" + number; 
      //loop for string
      for(int i = 0; i < stringNumber.length()-1; i++){
         //check to see if charAt i is equal to charAt i + 1
         if(stringNumber.charAt(i) == stringNumber.charAt(i+1)){
            return "+";
         }
      }
    return "-";
      
    }
    
}  
      
      



