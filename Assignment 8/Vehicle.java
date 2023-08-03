//CS110 OL1, Tushar Asthana 
//One constructor requires values for all instance variables, the second defaults mileage to 0. 
//Two Vehicle objects are equal if all instance variables are equal. 


//public class Vehicle
public class Vehicle 
{

// declare public variables
   public Person owner;
   public String make;
   public String model; 
   public int year; 
   public int mileage; 

   // vehicle constructor
   public Vehicle(Person owner, String make, String model, int year, int mileage)
   {
      
      this.owner = owner; 
      this.make = make;
      this.model = model; 
      this.year = year; 
      this.mileage = mileage; 
   
   }
   
   // Second Vehicle constructor
   public Vehicle(Person owner, String make, String model, int year)
   {
      
      this.owner = owner; 
      this.make = make;
      this.model = model; 
      this.year = year; 
      this.mileage = 0; 
   
   }
   
   // get Owner method
   public Person getOwner()
   {

      return owner;

   }
   
   // get make method
   public String getMake()
   {
   
      return make; 
   }
   
   // getModel method
   public String getModel()
   {
   
      return model;
      
   }
   
   // getYear method
   public int getYear()
   {
   
      return year;
      
   }
   
   // getMileage method
   public int getMileage()
   {
   
      return mileage;
      
   }
   
   // setOwner method using Person
   public void setOwner(Person owner)
   {
   
      this.owner = owner; 
      
   }
   
   // setMake method using string
   public void setMake(String make)
   {
   
   
      this.make = make;
   }
   
   // setModel method using string
   public void setModel(String model)
   {
   
      this.model = model; 
   
   }
   
   // setYear method using int
   public void setYear(int Year)
   {
   
      this.year = year;
   }
   
   // setMileage method using int
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
   // if true, return true 
      return true;
   }
   
   // if  false, return false 
   return false;
   
   }

}