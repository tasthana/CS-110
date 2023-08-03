//CS110 OL1, Tushar Asthana 
//The single constructor for this class requires value for all 3 instance variables. 
//Two Person objects are considered equal if all 3 instance variables are equal.


//Public Class Person 
public class Person
{
   //declare private varibles 
   public String name;
   public String address; 
   public String phone; 
   
   // Constructor Person 
   public Person(String name, String address, String phone) 
   
   {
   
      this.name = name;
      this.address = address; 
      this.phone = phone;
   }
   
   // getName method
   public String getName()
   {
   
      return name;
   
   }
   
   // getAddress method 
   public String getAddress()
   {
   
      return address;
   
   }
   
   // getPhone method 
   public String getPhone()
   {
   
      return phone;
  
   }
   
   // setName method 
   public void setName(String name)
   {
   
      this.name = name;
   
   }
   
   // setAddress method 
   public void setAddress(String address)
   {
   
      this.address = address;
   
   }
   
   // setPhone method 
   public void setPhone(String phone)
   {
   
      this.phone = phone;
   
   }
   
   // toString method 
   public String toString()
   {
   
      return name + ", " + address + ", " + phone;
   
   }
   
   // boolean method, takes in object 
   public boolean equals(Person person1)
   {
   
   if(person1.getName() == this.name && person1.getAddress() == this.address && person1.getPhone() == this.phone)
   {
      // if true, return true 
      return true; 
   }
      // if false, return false 
      return false;
   }
}
   