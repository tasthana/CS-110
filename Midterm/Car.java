// Tushar Asthana, CS110 OL1, Midterm Coding Question 2


public class Car
{
      private int year;
      private String make;
      private String model;
      static final int DEFAULT_YEAR = 2022; 
   
   
   public Car(String carModel, String carMake, int carYear)
   {
      make = carMake;
      model = carModel;
      year = DEFAULT_YEAR;
   }
   
   public Car(String carMake, String carModel)
   {
      this.make = carMake;
      this.model = carModel;
   } 
   
   public String getCarMake()
   {
      return make;
   } 
   
   public void setCarModel(String model)
   {
      this.model = model;
      } 
   
   public void setCarYear(int year)
   {
      this.year = year;
      } 
   
   public String toString()
   {
      String carInfo = year + make + model;
      return carInfo; 
   } 
}

      
   
   
    
