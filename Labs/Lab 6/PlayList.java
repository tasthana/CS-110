import java.io.*;
import java.util.Scanner;

/**
 * This program creates a list of songs for a playlist
 * by reading from a file.
 */
public class PlayList
{
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(new File("Classics.txt"));
        String title;
        String artist;
        final int NUM_SONGS = 6;

   // ADD LINES FOR TASK #2 HERE
   // Declare an array of Song objects, called songlist, 
   // with a size of NUM_SONGS

  Song[] songList = new Song [NUM_SONGS];
   for (int i = 0; i < songList.length ; i++)
   {  
       title = input.nextLine();
       artist = input.nextLine(); 
       songList[i] = new Song (title, artist);  
   }            
// ADD LINES FOR TASK #3 HERE
// Fill the array by creating a new song with
// the title and artist and storing it in the
// appropriate position in the array



// ADD LINES FOR TASK #4 HERE
// Print the contents of the array to the console }

    System.out.printf("Contents of Classics:");
      for (int i = 0; i < songList.length; i++)
      {
          // Print the contents of the array to the console
          System.out.println(songList[i]);
      }
      
      // Additional : Closing the scanner.
      input.close();
   }
}

