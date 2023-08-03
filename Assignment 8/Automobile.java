/* CS110 OL1, Tushar Asthana 
Create a single appropriate constructor. 
In addition, it has an integer number of passengers (numPassengers) it holds and as well as a boolean value 
indicating if it is an SUV (isSUV). 
There are getters and setters for both instance variables.
*/


// Extender class Automobile 
public class Automobile extends Vehicle

   {
   // declare instance variables
   private int numPassengers;
   private boolean isSUV;
   
   /* Automobile class 
   // @param owner, make, model, year, milage, numPassengers, isSUV
   // @return super string (owner, make, model, year, mileage) and numPassengers, isSUV
   */
   public Automobile(Person owner, String make, String model, int year, int mileage, int numPassengers, boolean isSUV)
   {
      super(owner,make,model,year,mileage);
      this.numPassengers = numPassengers;
      this.isSUV = isSUV;
   }
   
   //getter for number of passengers
   public int getNumPassengers()
   {
      return numPassengers;
   }
   
   //getter for isSUV
   public boolean getIsSUV()
   {
      return isSUV;
   }
   
   //setter for number of passengers 
   public void setNumPassengers(int numPassengers)
   {
      this.numPassengers = numPassengers;
   }
   
   //setter for IsSUV
   public void setIsSUV(boolean isSUV)
   {
      this.isSUV = isSUV;
   }
   
   /*
   / @ return toString() method that returns super string, with an additon of numPassengers
   */ 
   public String toString()
   {
      String s;
      if (isSUV == true)
         s = super.toString() + " " + numPassengers + " passengers SUV";
      else
         s = super.toString() + " " + numPassengers + " passengers";
      return s;
   }
   
   
   /*
   /@returns boolean, if a car is the same as another or isSUV
   */
   public boolean equals(Object other)
   {
      Automobile aOther = (Automobile)other;
      return super.equals(other) &&
             this.numPassengers == aOther.numPassengers &&
             this.isSUV == aOther.isSUV;
   }
}