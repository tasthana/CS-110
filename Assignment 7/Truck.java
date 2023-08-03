// CS110 OL1, Tushar Asthana 
//In addition, the Truck class has private constants for the default capacity of 1 and default number of axles which is 2. 
//Two Truck objects are equal if their Vehicle part is equal and the number of tons and axles are equal.


// Extension class for Vehicle
public class Truck extends Vehicle
{

   //declare private variables 
   private int capacity = 1; 
   private int numAxles = 2; 
   private int DEF_CAPACITY = 1;
   private int DEF_AXLES = 2;


   /** @param owner, make, model, year,mileage, capacity, number of axles  
   *   @returns owner, make, model, year,mileage, capacity, number of axles
   */ 
   public Truck(Person owner, String make, String model, int year, int mileage, int capacity, int numAxles)
   {
      super(owner,make,model,year,mileage);
      this.capacity = capacity;
      this.numAxles = numAxles;
   }
   
   // Overloading Constructor class
   /** @param name, address, phone, make, model, year,mileage, default capacity, default number of axles  
   *   @returns name, address, phone, make, model, year,mileage, default capacity, default number of axles 
   */ 
   public Truck(String name, String address, String phone, String make, String model, int capacity, int numAxles)
   {
      super(new Person(name,address,phone),make,model);
      this.capacity = DEF_CAPACITY; 
      this.numAxles = DEF_AXLES; 
   }

   // getter for capacity 
   public int getCapacity()
   {
      return capacity;
   }
   
   // getter for number of axles
   public int getnumAxles()
   {
      return numAxles;
   }
   
   // setter for capacity
   public void setCapacity(int capacity)
   {
      this.capacity = capacity;
   }
   
   // setter for number of axles 
   public void setnumAxles(int numAxles)
   {
      this.numAxles = numAxles;
   }
   
   // To String method
   public String toString()
   {
      return this.owner + '\n' + this.make + ' ' + this.model + ' ' + this.year + ' ' + this.mileage;
   }
   

}






