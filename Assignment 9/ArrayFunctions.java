//CS110 OL1, Tushar Asthana, Assignment 9 

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


class ArrayFunctions
{

     /**
     * readArray – takes in a String representing the filename and a reference to an array of Strings
     * The method will fill the array from the file.
     */

    public static int readArray(String fileName, String[] nameArray)

    {
      int n = 0;
      
      //exception handling 
      try
        {
            // throw NullPointerException
            if(nameArray == null)
            {
                throw new NullPointerException();   
            }
            
            // opening  file
            Scanner f = new Scanner(new File(fileName));
            
            // reading names and storing them in array
            while(f.hasNextLine() && n < nameArray.length)
            {
                nameArray[n++] = f.nextLine();
            }
            
            // closing the file
            f.close();
            
            // returning the number of names
            return n;
        }

        catch(Exception e)
        {
            // return 0 if catch block is executed
            return 0;
        }
    }

     /**
     * writeArray – takes in a String representing the filename, an array of Strings and returns a boolean.
     *  of Strings and returns a boolean.
     */
     
    public static boolean writeArray(String fileName, String[] nameArray)
    {
        // exception handling 
        try
        {
            // NullPointerException
            if(nameArray == null)
            {
                throw new NullPointerException();   
            }
            
            //writing data to file object
            FileWriter n = new FileWriter(fileName);
            
            // writing names/formatting
            for(int i = 0; i < nameArray.length && nameArray[i] != null; i++ )
            {
                n.write((i+1)+": "+nameArray[i]+"\n");
            }

            // closing the fileWriter after writing the names
            n.close();

            // returning true after writing
            return true;
        }

        catch(Exception e)
        { 
            return false;
        }    
    }


     /**
     * The method takes a second integer, n, representing the number of elements in the array, allowing support of partially full arrays.
     * The method works on an array of Strings.
     */
    public static boolean selectionSort(String[] nameArray, int n)
    {
        try
        {
            // NullPointerException
            if(nameArray == null)
            {
                throw new NullPointerException();
            }
            
            
            for(int i = 0; i < n-1; i++)
            {
                int min=i;
                for(int j = i+1; j < n; j++)
                {
                    if(nameArray[j].compareTo(nameArray[min]) < 0)
                    {
                        min = j;
                    }
                }

                // swapping the ith element with the minimum element after the ith index
                String z = nameArray[i];
                nameArray[i] = nameArray[min];
                nameArray[min] = z;
            }

            // returning true when the sort is successful
            return true;
        }
        
        catch(Exception e)
        {
            // returning false
            return false;
        }
    }


//binarySearch – recursive implementation of binary search. 

    public static int binarySearch(String[] nameArray, int first, int last, String key)
    {
        if(last >= first && first < nameArray.length-1)
        {
            // calculating k
            int k = first +(last-first)/2;
            // checkin k element is the key, if yes return k
            if(nameArray[k].equals(key))
            {
                return k;
            }

            // if k element is greater than key then returning the recursive call with last as k-1
            if(nameArray[k].compareTo(key) > 0)
            {
                return binarySearch(nameArray, first, k-1, key);
            }

            // if k element is smaller than key then returning the recursive call with first as k+1
            return binarySearch(nameArray, k+1, last, key);
        }    
        return -1;
    }
}