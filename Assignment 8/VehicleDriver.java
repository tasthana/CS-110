// CS110 OL1, Tushar Asthana 

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class VehicleDriver 
{
  public static void main(String[] args)throws FileNotFoundException
  {
      //open file
      File car = new File("vehicles.txt");
      //scanner to read file 
      Scanner myReader = new Scanner(car);
      
      //while loop to read and write into string Data
      while (myReader.hasNextLine()) 
      {
        String data = myReader.nextLine();
        System.out.println(data);
      }
        //close file
        myReader.close();
   }    
         
        
}
 