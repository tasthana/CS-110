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


   // Constructer class
   public Truck(Person owner, String make, String model, int year, int mileage, int capacity, int numAxles)
   {
      super(owner, make, model, year, mileage);
      this.mileage = mileage; 
      this.capacity = capacity;
      this.numAxles = numAxles;
   }
   
   // Overloading Constructor class 
   public Truck(String name, String address, String phone, String make, String model, int year, int mileage)
   { 
      super(new Person(name,address,phone), make, model, year, mileage);
      capacity = DEF_CAPACITY;
      numAxles = DEF_AXLES;
   }

   // getCapacity method
   public int getCapacity()
   {
      return capacity;
   }
   
   // getnumAxlrs method
   public int getNumAxles()
   {
      return numAxles;
   }
   
   // set capacity method
   public void setCapacity(int capacity)
   {
      this.capacity = capacity;
   }
   
   // set numAxles method
   public void setnumAxles(int numAxles)
   {
      this.numAxles = numAxles;
   }
   
   // to string method
   public String toString()
   {
      return super.toString() + " " + capacity + " ton " + numAxles + " axles";
   }
}
   







