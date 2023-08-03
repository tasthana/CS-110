/*CS110 OL1, Tushar Asthana 
/ A Taxi “is-a” Automobile. In addition, it has a driver (a Person object) and an ID (a String). 
/ Create a single appropriate constructor. A Taxi has getters and setters for both instance variables
*/


public class Taxi extends Automobile
{
   // declare instance variables
   private String ID;
   private Person driver;
   
   
   //super method call, plus other instance variables
   public Taxi(Person owner, String make, String model, int year, int mileage, 
               int numPassengers, boolean isSUV, String ID, Person driver)
   {
      super(owner,make,model,year,mileage,numPassengers,isSUV);
      this.ID = ID;
      this.driver = driver;
   }
   
   //getter for id
   public String getID()
   {
      return ID;
   }
   
   //getter for driver
   public Person getDriver()
   {
      return driver;
   }
   
   //setter for id 
   public void setID(String ID)
   {
      this.ID = ID;
   }
   
   //setter for driver 
   public void setDriver(Person driver)
   {
      this.driver = driver;
   }
   
   
   /*
   //toString method
   //@return super string, driver, and id
   */
   public String toString()
   {
      String s = super.toString() + ",\nDriver: " + driver.toString() + " ID#" + ID;
      return s;
   }
   
   /*
   //Include an equals method. 
   //Two Taxi objects are the same if their Automobile part is the same, as well as the driver and ID.
   //@param object 
   //@return true or false
   */
      public boolean equals(Object other)
   {
      Taxi tOther = (Taxi)other;
      return super.equals(tOther) &&
             this.ID.equals(tOther.ID) &&
             this.driver.equals(tOther.driver);
             
    }
             
   
}