// CS110, Tushar Asthana 


// Extention class Automobile 
public class Automobile 

{ 
   //declare int and boolean variables
   int numPassengers = 0;
   boolean isSUV = true;


   // Constructor for Automobile 
   public Automobile (int numPassengers, boolean isSUV)

   { 
   
      this.passenger = passenger;
      this.suv = suv;
   
   }
   
    
   // get Passenger method
   public int getnumPassengers()
   {

      return passenger;
   }
   
   // get SUV method 
   public boolean getisSUV()
   {
   
      return suv;
      
   }

   // set passengers method
   public void setPassengers(int numPassengers)
   {
   
      this.passenger = passenger;
      
   }

   // set SUV method
   public void setSUV(boolean isSUV)
   {
   
      this.suv = suv;
      
   }
   
   // equals(object) method
   public boolean equals(Vehicle Vehicle1)
   {
   
   if(Vehicle1.getnumPassengers() == this.passenger && Vehicle1.getisSUV() == this.suv);
   {
      // if true, return true 
      return true;
   }
   
   // if  false, return false 
   return false;
   
   }

   //toString method
   public String toString()
   {
   
   //format output
      return this.owner + " " + this.make + " " + this.model + " " + this.year + " " + this.mileage + " " + this.passenger + " " + this.suv;




}