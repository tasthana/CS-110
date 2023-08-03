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
   
   /** @param string name, address, phone
   *   @return name, address, phone 
   */ 
   public Person(String name, String address, String phone) 
   
   {
      this.name = name;
      this.address = address; 
      this.phone = phone;
   }
   
   // getter for name 
   public String getName()
   {
      return name;
   }
   
   // getter for address 
   public String getAddress()
   {
      return address;
   }
   
   // getter for phone
   public String getPhone()
   {
      return phone;
   }
    
   // setter for name 
   public void setName(String name)
   {
      this.name = name;
   }

   // setter for address
   public void setAddress(String address)
   {
      this.address = address;
   }
   
   // setter for phone
   public void setPhone(String phone)
   {
      this.phone = phone;
   }
   
   // toString method 
   public String toString()
   {
      return name + " " + address + " " + phone;
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
   