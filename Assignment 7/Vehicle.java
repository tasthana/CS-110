//CS110 OL1, Tushar Asthana 
//One constructor requires values for all instance variables, the second defaults mileage to 0. 
//Two Vehicle objects are equal if all instance variables are equal. 


public class Vehicle 
{

// declare private variables
   public Person owner;
   public String make;
   public String model; 
   public int year; 
   public int mileage; 

   /** @param owner, make, model, year, mileage
   *   @return owner, make, model, year, mileage 
   */ 
   public Vehicle(Person owner, String make, String model, int year, int mileage)
   {
      
      this.owner = owner; 
      this.make = make;
      this.model = model; 
      this.year = year; 
      this.mileage = mileage; 
   
   }
   
   /** @param owner, make, model, year, mileage
   *   @return owner, make, model, year, default mileage
   */
   public Vehicle(Person owner, String make, String model, int year)
   {
      
      this.owner = owner; 
      this.make = make;
      this.model = model; 
      this.year = year; 
      this.mileage = 0; 
   
   }
   
   // getter for Person 
   public Person getOwner()
   {
      return owner;
   }
   
   // getter for make
   public String getMake()
   {
      return make; 
   }
   
   // getter for model 
   public String getModel()
   {
      return model;
   }
   
   // getter for year
   public int getYear()
   {
      return year;
   }
   
   // getter for mileage
   public int getMileage()
   {
      return mileage;
   }
   
   // setter for Person
   public void setOwner(Person owner)
   {
      this.owner = owner; 
   }
   
   // setter for make 
   public void setMake(String make)
   {
      this.make = make;
   }
   
   // setter for model 
   public void setModel(String model)
   {
      this.model = model; 
   }
   
   // setter for year
   public void setYear(int Year)
   {
      this.year = year;
   }
   
   // setter for mileage
   public void setMileage(int mileage)
   {
      this.mileage = mileage;
   }
   
   //toString method
   public String toString()
   {
   
   //format output
      return this.owner + " " + this.make + " " + this.model + " " + this.year + " " + this.mileage;
   
   }
   
   // equals(object) method
   public boolean equals(Vehicle Vehicle1)
   {
   
   if(Vehicle1.getOwner() == this.owner && Vehicle1.getMake() == make && Vehicle1.getModel() == model && Vehicle1.getMileage() == mileage)
   {
      return true;
   }
     return false;
   }

}