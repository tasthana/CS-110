// CS110, Tushar Asthana 


// Extention class Taxi for Automobile 
public class Taxi extends Automobile 

{ 
   //declare int and boolean variables
   String iD
   new driver;


   // Constructor for Automobile 
   public Automobile (int iD, new driver)

   { 
   
      this.identity = identity;
      this.person = person;
   
   }
   
    
   // get Passenger method
   public int getiD()
   {

      return identity;
   }
   
   // get SUV method 
   public new getdriver()
   {
   
      return person;
      
   }

   // set identity method
   public void setidentity(String iD)
   {
   
      this.identity = identity;
      
   }

   // set SUV method
   public void setdriver(new person)
   {
   
      this.person = person;
      
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
      return this.owner + " " + this.make + " " + this.model + " " + this.year + " " + this.mileage + " " + this.passenger + " " + this.suv + " " + this.person + " " + this.identity;




}